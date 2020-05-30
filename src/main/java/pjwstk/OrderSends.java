package pjwstk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

public class OrderSends {
    Bank bank = null;
    public OrderSends(Bank bank) {
        this.bank = bank;

    }
    public BigDecimal accountBalance(User user) {
        return getAccountForUser(user).get().getBalance();
    }
    public Optional<Account>getAccountForUser(User user) {
        Optional<Account> result = Optional.ofNullable(null);
        for (Account account : bank.getAccounts()) {
            if (account.getOwner().getId() == user.getId()) {
                result = Optional.ofNullable(account);
            }
        }
        return result;
    }

    public Boolean checkBankAndAccountCorrelation(Account account){
        String bankFromIdAccount = account.getAccountNumber().substring(1,5);
        return bankFromIdAccount.equals(bank.getId());
    }
    public BigDecimal topUpAccount(BigDecimal topUpAmount,User user ){
        getAccountForUser(user).get().setBalance(topUpAmount);
        return topUpAmount;
    }
    public void transferMoney(User fromUser, User toUser, BigDecimal amount){
        Account fromUserAccount = getAccountForUser(fromUser).get();
        Account toUserAccount = getAccountForUser(toUser).get();
        fromUserAccount.setBalance(fromUserAccount.getBalance().subtract(amount));
        toUserAccount.setBalance(fromUserAccount.getBalance().add(amount));

    }

}
