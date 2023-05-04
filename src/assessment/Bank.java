package assessment;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<AdvancedAccount> accounts = new ArrayList<>();
    private int count;

    public void registerAccount(String name, String pin){
        AdvancedAccount account = new AdvancedAccount(name, pin);
        account.setAccountNumber(++count);
        accounts.add(account);
    }
}