 
public class CreditCard extends BankCard        //creating a class inheriate the super class
{
    //declaring variables
    private int cvc_Number;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //creating a constructor
    public CreditCard(int Card_Id, String Client_Name, String issuer_Bank, String Bank_Account, double Balance_Amount,int CVC_Number,double Interest_Rate, String Expiration_Date)
    {
        super(Balance_Amount, Card_Id, Bank_Account, issuer_Bank);    //calling super class constructor.
        super.setClientName(Client_Name);
        this.cvc_Number= CVC_Number;
        this.interestRate = Interest_Rate;
        this.expirationDate = Expiration_Date;
        this.isGranted = false;
    }
    
    //using accossor method.
    public int getCVC_Number()
    {
        return cvc_Number;
    }
    
    public double getCreditLimit()
    {
        return creditLimit;
    }
    
    public double getInterestRate()
    {
        return interestRate;
    }
    
    public String getExpirationDate()
    {
        return expirationDate;
    }
    
    public int getGracePeriod()
    {
        return gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return isGranted;
    }
    
    public void setCVCNumber(int cvc)
    {
        this.cvc_Number = cvc;
    }
    
    
    public void setIsGranted(boolean isgranted)
    {
        this.isGranted = isgranted;
    }
    
    //creating a method
    public void setCreditLimit(double credit_Limit, int grace_Period) 
    {
        if (credit_Limit <= 2.5 * super.getBalanceAmount()) 
        {
          this.creditLimit = credit_Limit;
          this.gracePeriod = grace_Period;
          isGranted = true;
        }
        else 
        {
          System.out.println("Credit cannot be issued.");
        }
    }
    
    //creating a method.
    public void cancelCreditCard() 
    {
        if (isGranted) 
        {
          cvc_Number = 0;
          creditLimit = 0;
          gracePeriod = 0;
          isGranted = false;
        } 
        else 
        {
          System.out.println("Not cancelled.");
        }
    }
    
    //method override
    public void display() 
    {
        super.display();
        System.out.println("Credit limit: " + creditLimit);
        System.out.println("Grace period: " + gracePeriod);
        System.out.println("CVC number: " + cvc_Number);
        if (isGranted == true) 
        {
          System.out.println("Interest rate: " + interestRate);
          System.out.println("Expiration date: " + expirationDate);
          
        }
    }   
    
    
}