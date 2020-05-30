package pjwstk;

import java.util.ArrayList;

public class Bank {
    private int id;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private String name;
    private String address;
    public static boolean isBankAccountValid(String accountNumber){
        return accountNumber.matches("^(\\d{26})");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Account> getAccounts() {
        ArrayList<Account> accounts = this.accounts;
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
