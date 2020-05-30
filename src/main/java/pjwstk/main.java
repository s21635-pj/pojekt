package pjwstk;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        User user1 = new User(1,"Paulina","klebba",526374,"mail");
        User user2 = new User(2,"jan","kowalski",123456,"mail");

        Account account1 = new Account("123","12345678963214578963215896",user1,"kot1","haslo");
        Account account2 = new Account("645","12345678901234567890123456",user2,"kot34", "haslo123");
        ArrayList<Account> lista =  new ArrayList<Account>();
       lista.add(account1);
       lista.add(account2);
        Bank bank = new Bank(2345,lista,"PKO","Reda");


    }
}
