 
 public class DebitCard extends BankCard         //creating a class inhering the super class
{
    //declaring attribute.
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //creating constructor.
    public DebitCard(double balance_Amount, int card_Id, String bank_Account, String issuer_Bank, String client_Name, int pin_Number) 
    {
        super(balance_Amount, card_Id, bank_Account, issuer_Bank);   //calling super class.
        super.setClientName(client_Name);
        this.pinNumber = pin_Number;
        this.hasWithdrawn = false;
    }
    
    //using accossor method
    public int getPinNumber() 
    {
        return pinNumber;
    }

    public int getWithdrawalAmount() 
    {
        return withdrawalAmount;
    }

    public String getDateOfWithdrawal()
    {
        return dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() 
    {
        return hasWithdrawn;
    }
    
    //using setter method
    public void setWithdrawalAmount(int withdrawal_Amount)
    {
        this.withdrawalAmount = withdrawal_Amount;
    }
    
    //creating withdraw method
    public void withdraw(int withdrawal_Amount, String date_Of_Withdrawal, int pin_Number)
    {
        //using if-else statement.
        if (pin_Number == this.pinNumber && withdrawal_Amount <= getBalanceAmount()) 
        {
            this.withdrawalAmount = withdrawal_Amount;
            this.dateOfWithdrawal = date_Of_Withdrawal;
            super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
            
            hasWithdrawn = true;
            
        }
        else
        {
            System.out.println("Check the pin or check balanceAmount");
        }
        
    }
    
    //method override.
    public void display() 
    {
        super.display();     //super class method call.
        System.out.println("Pin number: " + pinNumber);
        if (hasWithdrawn = true) 
        {
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " + dateOfWithdrawal);
        }
        else 
        {
            System.out.println("No transactions have done. Balance amount: " + getBalanceAmount());
        }
    }
    
}