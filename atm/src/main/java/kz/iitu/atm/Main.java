package kz.iitu.atm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context
        = new AnnotationConfigApplicationContext(SpringConfig.class);

//    context.scan("kz.iitu.atm");
//    context.refresh();

    ATM atm = context.getBean("atm", ATM.class);
    atm.showMenu();
  }
}
