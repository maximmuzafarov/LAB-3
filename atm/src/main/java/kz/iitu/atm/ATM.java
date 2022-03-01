package kz.iitu.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("atm")
public class ATM {

  @Autowired
  @Qualifier("halykBank")
  private Bank bank;

  public void showMenu() {
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("\n4. Exit");

    System.out.println("\n Please enter you choice: ");

    Scanner scanner = new Scanner(System.in);
    Integer choice = scanner.nextInt();
    if (choice == 2) {
      System.out.println("Please enter the sum you want to withdraw: ");
      Double sum = scanner.nextDouble();
      bank.withdraw("4406 123 123 123", sum);
      System.out.println("\n Please enter your next choice: ");
      showMenu();


    } else if (choice == 1) {
      System.out.println("Please enter the sum you want to deposit: ");
      Double sum = scanner.nextDouble();
      bank.deposit("4406 123 123 123" , sum);
      System.out.println("\n Please enter your next choice: ");
      showMenu();

    } else if (choice == 3) {
      Double sum = scanner.nextDouble();
      bank.checkBalance("4406 123 123 123" , sum);
      System.out.println("\n Please enter your next choice: ");
      showMenu();
    }
  }
}
