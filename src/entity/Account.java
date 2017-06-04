package entity;

import java.util.Date;

public class Account {
    private Date creationDate;
    private float balance;
    private String id;
    
    

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Account{" + "creationDate=" + creationDate + ", balance=" + balance + '}';
    }
    
    public void withdraw(float update) {
        this.balance = this.balance - update;
    }
    
    public void deposit(float update) {
        this.balance = this.balance + update;
    }
}
