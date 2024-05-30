  
public class BankCard             //creating class
{
    //declaring attributies.
    private String clientName;
    private String issuerbank;
    private String bankAccount;
    private int cardID;
    private double balanceAmount;

    //creating constructor
    public BankCard(double balance_Amount, int card_ID, String bank_Account,String issure_Bank)
    {
        this.clientName = "";         //initialising null value.
        this.issuerbank = issure_Bank;
        this.bankAccount = bank_Account;
        this.cardID = card_ID;
        this.balanceAmount = balance_Amount;
    }
    
    //using mutator method
    public void setClientName(String Client_Name)
    {
        this.clientName = Client_Name;
    }
    
    public void setBalanceAmount(double Balance_Amount)
    {
        this.balanceAmount = Balance_Amount;
    }
    
    //using accossor method.
    public String getClientName()
    {
        return this.clientName;
    }
    
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    public String getissureBank()
    {
        return this.issuerbank;
    }
    
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    public int getcardID()
    {
        return this.cardID;
    }
    
    //creating display method.
    public void display()
    {
       if(this.clientName.equals(""))    //if statement for condition.
        {
            System.out.println("client_name required");
        }
         else 
         {
           System.out.println("Your Name: " +this.clientName);
         }
       System.out.println("Your Bank: "+this.issuerbank);
       System.out.println("Your Bank acc: "+this.bankAccount);
       System.out.println("Your CardID: "+this.cardID);
       System.out.println("Your Balance: "+this.balanceAmount);
    }
    
    
}
