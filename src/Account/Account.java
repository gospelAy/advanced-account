package Account;

import javax.xml.validation.Validator;
import java.math.BigDecimal;

public class Account {

    private BigDecimal balance = BigDecimal.ZERO;
    private final String pin;
    private int accountNumber;


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public String getPin(){
    return pin;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    private String accountName;

    public Account(int accountNumber, String accountName, String accountPin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = accountPin;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }



    public BigDecimal getBalance(String pin) {
        validate(pin);
        return balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public void withdrawal(BigDecimal amount, String pin){
        if (balance.compareTo(amount) > -1){
            validate(pin);

            if (!pin.equals(this.pin))throw new IllegalArgumentException("invalid pin");
        }
        balance = balance.subtract(amount);
    }

    public void validate(String pin){
        if (!pin.equals(this.pin))throw new IllegalArgumentException("invalid pin");
    }


    @Override
    public String toString(){
        return String.format("""
                =========================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                =========================
                """,
                accountName, accountNumber, balance.toPlainString());
    }

}

