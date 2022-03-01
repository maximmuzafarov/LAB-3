package kz.iitu.atm;

import java.util.Date;

public class Account {

  private Long id;
  private String cardNumber;
  private Date validUntil;
  private String owner;
  private Double balance;

  public Account() {
  }

  public Account(Long id, String cardNumber, Date validUntil, String owner, Double balance) {
    this.id = id;
    this.cardNumber = cardNumber;
    this.validUntil = validUntil;
    this.owner = owner;
    this.balance = balance;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Date getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(Date validUntil) {
    this.validUntil = validUntil;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }
}
