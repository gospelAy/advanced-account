package assessment;

public class AdvancedAccount {
    private String name;
    private double balance;
    private String pin;
    private int accountNumber;

    public AdvancedAccount(String name, String pin){
        this.name = name;
        this.pin = pin;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount, String pin){
        if (pin.equals(this.pin)) balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }
}
