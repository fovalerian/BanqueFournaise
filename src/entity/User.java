package entity;

import java.util.ArrayList;
import java.util.Map;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phone;
    private Map<String,Account> accounts;
    private String id;
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Map<String,Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String,Account> accounts) {
        this.accounts = accounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address + ", phone=" + phone + ", accounts=" + accounts.toString() + '}';
    }
    
    public void linkAccount(Account account) {
        this.accounts.put(account.getId(), account);
    }
    
    public ArrayList findAllAccount() {
        ArrayList a = new ArrayList();
        for (Account acc : this.accounts.values()) {
            a.add(a);
        }
        return a;
    }
    
    public Float findBalance(){
        float b = 0;
        for (Account acc : this.accounts.values()) {
            b = b + acc.getBalance(); 
        }
        
        return b;
    }
}
