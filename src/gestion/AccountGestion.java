package gestion;

import entity.Account;
import java.util.Map;

public class AccountGestion {
    public Map addAccount(Map accounts, Account account) {
        accounts.put(account.getId(), account);
        return accounts;
    }
    
    public Map deleteAccount(Map accounts, Account account){
        if (accounts.containsKey(account.getId())){
            accounts.remove(account.getId());
            System.out.println("Account "+account.getId()+" is delete");
        } else {
            System.out.println("This account dosn't exist");
        }
        return accounts;
    }
    
    public Map updateAccount(Map accounts, Account account){
        if(accounts.containsKey(account.getId())){
            accounts.remove(account.getId());
            accounts.put(account.getId(), account);
        } else {
            System.out.println("This account dosn't exist");
        }
        return accounts;
    }
    
    public void readAccount(Map accounts,Account account) {
        if(accounts.containsKey(account.getId())) {
            System.out.println(accounts.get(account.getId()).toString());
        } else {
            System.out.println("This account dosn't exist");
        }
    }
}
