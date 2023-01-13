import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface
{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;
    // Constructor by pressing Alt+ Insert Select name,balance,password as User input.
    public SBIUser(String name, double balance, String password) {
        // User initalize.
        this.name = name;
        this.balance = balance;
        this.password = password;
        // bank is initalizing.
        this.rateOfInterest = 6.5;
        this.accountNo= String.valueOf(UUID.randomUUID());

    }
    // Setters and getters pressing Alt+Insert.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }




    @Override
    public double checkBalance()
    {
        return balance;
    }

    @Override
    public String addMoney(int amount)
    {
        balance=balance+amount;
        return "Your New Balance is :"+balance;
    }

    @Override
    public String withdrawMoney(int amount,String enteredPassword)
    {
        if(Objects.equals(enteredPassword,password))
        {
            if(amount>balance)
            {
                return "Sorry bro ! Insufficient Money";
            }
            else
            {
                balance=balance-amount;
                return "Your balance:" +balance;
            }
        }
        else
        {
            return "Wrong Password";
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
