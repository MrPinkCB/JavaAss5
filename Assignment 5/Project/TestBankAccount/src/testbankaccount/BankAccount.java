package testbankaccount;


public class BankAccount{
    String Name, AccountNumber, CurrentAmount;
    //Default constructor
    public BankAccount()
    {
        Name="";
        AccountNumber="";
        CurrentAmount="";
    }
    //Mutator
    public BankAccount(String name,String AccNum,String CurAmount)
    {
        Name=name;
        AccountNumber=AccNum;
        CurrentAmount=CurAmount;
    }
    //Name getter
    String getName()
    {
        return Name;
    }
    //Account number getter
    String getAccountNumber()
    {
        return AccountNumber;
    }
    //Current amount getter
    String getCurrentAmount()
    {
        return CurrentAmount;
    }
    //Name setter
    void setName(String name)
    {
        Name=name;
    }
    //Account number setter
    void setAccountNumber(String AccNum)
    {
        AccountNumber=AccNum;
    }
    //Current amount setter
    void setCurrentAmount(String CurAmount)
    {
        
        CurrentAmount=CurAmount;
    }
}
