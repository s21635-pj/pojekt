package pjwstk;

import java.util.ArrayList;

public class Bank {
    private int id;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private String name;
    private String address;

    public static boolean isBankAccountValid(String accountNumber){
        if (accountNumber.matches("^(\\d{26})") == true){
            System.out.println("Zagdza się");
        }
        else {
            System.out.println("Nie zgadza się");
        }
        return accountNumber.matches("^(\\d{26})");

    }

    public Bank(int id, ArrayList<Account> accounts, String name, String address) {
        this.id = id;
        this.accounts = accounts;
        this.name = name;
        this.address = address;
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
