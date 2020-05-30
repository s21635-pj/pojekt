package pjwstk;

import java.math.BigDecimal;

public class Account {
   private String pin;
   private String accountNumber;
   private User owner = null;
   private String login;
   private String password;
   private BigDecimal balance;

    public Account(String pin, String accountNumber, User owner, String login, String password) {
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.login = login;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
