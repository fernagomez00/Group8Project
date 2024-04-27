package edu.depaul.cdm.se452.Group8Project.checking;

import java.math.BigDecimal;
import edu.depaul.cdm.se452.Group8Project.Account;
import edu.depaul.cdm.se452.Group8Project.customer.Customer;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class CheckingAccount extends Account{
  private boolean debit;

  public CheckingAccount(Customer customer, BigDecimal startingBalance, int bankAssignedNumber, int pin, boolean debit) {
    super(customer, startingBalance, bankAssignedNumber, pin);
    this.debit = debit;
  }
  
  public BigDecimal withdraw(BigDecimal amount){
    //TODO update balance
    return null;
  }
  public BigDecimal checkBalance(){
    //TODO return balance
    return null; //this.getBalance();
  }
}
