
package main;

import entity.Account;
import entity.User;
import gestion.AccountGestion;
import gestion.UserGestion;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BanqueFournaise {

    public static void main(String[] args) {
        AccountGestion ag = new AccountGestion();
        UserGestion ug = new UserGestion();
        Map<String, User> users = new HashMap<>();
        Map<String, Account> accounts = new HashMap<>();
        User user = new User();
        Account account = new Account();
        account.setBalance(5000);
        account.setCreationDate(new Date());
        account.setId("01");
        accounts.put(account.getId(), account);
        
        Account account2 = new Account();
        account2.setBalance(666);
        account2.setCreationDate(new Date());
        account2.setId("02");
        accounts.put(account2.getId(), account2);
        
        user.setFirstName("Valérian");
        user.setLastName("Fournaise");
        user.setId("01");
        user.setAge(25);
        user.setPhone("0666666666");
        user.setAccounts(accounts);
        ug.addUser(users, user);
        ug.readUser(users, user);
        ug.deleteUser(users, user);
        ug.readUser(users, user);
        ug.addUser(users, user);
        ag.addAccount(accounts, account2);
        ug.readUser(users, user);
        ag.deleteAccount(accounts, account2);
        ag.readAccount(accounts, account2);
    }
    
}
