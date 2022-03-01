package kz.iitu.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"kz.iitu.atm"})
public class SpringConfig {

  @Bean("halykBankAccounts")
  public List<Account> getAccountList() {
    List<Account> accountList = new ArrayList<>();
    accountList.add(new Account(1L, "4406 123 123 123", new Date(), "Bill", 1000.0));
    accountList.add(new Account(2L, "4407 123 123 123", new Date(), "Nick", 2000.0));

    return accountList;
  }
}
