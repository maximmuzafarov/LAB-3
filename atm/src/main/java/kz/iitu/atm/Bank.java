package kz.iitu.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("halykBank")
public class Bank {

  @Autowired
  @Qualifier("halykBankAccounts")
  private List<Account> accounts;

  public void withdraw(String cardNumber, Double sum) {
    System.out.println("Bank.withdraw");
    for (Account account : accounts) {
      if (account.getCardNumber().equals(cardNumber)) {
        Double finalBalance = account.getBalance() - sum;
        account.setBalance(finalBalance);

        System.out.println("Current updated balance: " + finalBalance);

        return;
      }
    }
  }

  public void deposit(String cardNumber, Double sum) {
    System.out.println("Bank.deposit");
    for (Account account : accounts) {
      if (account.getCardNumber().equals(cardNumber)) {
        Double finalBalance = account.getBalance() + sum;
        account.setBalance(finalBalance);

        System.out.println("Current updated balance: " + finalBalance);

        return;
      }
    }
  }

  public void checkBalance(String cardNumber, Double sum) {
    System.out.println("Bank.checkBalance");
    for (Account account : accounts) {
      if (account.getCardNumber().equals(cardNumber)) {
        Double finalBalance = account.getBalance();
        account.setBalance(finalBalance);
        System.out.println("Your balance now is: " + finalBalance);

        return;
      }
    }
  }
}







