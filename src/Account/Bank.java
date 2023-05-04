package Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<>();

    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size() + 1;
        Account newAccount = new Account(accountNumber, firstName + " " + lastName, pin);
        accounts.add(newAccount);
    }
    public int getNumberOfCustomers() {
        return accounts.size();
    }
    public String findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber)
                return String.format("""
                        ============================
                        Account Name: %s
                        Account Number: %d
                        ===========================
                        """, account.getAccountName(), account.getAccountNumber());
        }
        return null;

    }
    public String checkBalanceFor(int accountNumber, String pin) {
        for (Account account: accounts) {
            if (accountNumber == account.getAccountNumber()){
                return account.getBalance().toPlainString();
            }

        }
        return null;
    }
    public void depositInto(int accountNumber, BigDecimal amount) {
        for (Account account: accounts) {
            if (accountNumber == account.getAccountNumber()){
                account.deposit(amount);
            }
        }
    }

    public void withdrawFrom( BigDecimal amount, String pin) {
        for (Account account: accounts) {
            if (pin.equals(account.getPin())){
                account.withdrawal(amount, pin);
            }

        }
    }

    public void transfer( BigDecimal amount,  int receiverAccountNumber, String pin) {
        for (Account account: accounts) {
            if (pin.equals(account.getPin())){
                account.withdrawal(amount, pin);
                depositReceiver(receiverAccountNumber, amount);

            }
        }
//        Account senderAccount = findAccount(senderAccountNumber);
//        Account receiverAccount = findAccount(receiverAccountNumber);
//        senderAccount.withdrawal(amount, senderPin);
//        receiverAccount.deposit(amount);
    }

    private void depositReceiver(int receiverAccountNumber,BigDecimal amount) {
        for (Account account:accounts) {
              if (receiverAccountNumber == account.getAccountNumber()){
                  account.deposit(amount);
            }
        }

    }

    public void delete(int accountNumber) {
        for (Account account:accounts) {
            if (account.getAccountNumber() == accountNumber){
                accounts.remove(account);
            }
        }
        // IF YOU'RE REMOVING FROM AN ARRAY LIST YOU USE THE NAME OF THE ARRAY LIST
        // In this case that is accounts
    }
}


