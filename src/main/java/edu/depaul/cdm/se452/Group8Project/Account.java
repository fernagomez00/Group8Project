package edu.depaul.cdm.se452.Group8Project;

import edu.depaul.cdm.se452.Group8Project.customer.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import java.math.BigDecimal;
import java.util.UUID;


@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Account{
    
    @Id
    @GeneratedValue
    protected UUID id; // in-house number
    protected int number; // customer
    protected UUID primary; // the primary account holder
    private BigDecimal balance;
    protected int pin;
    
    

    
   public Account(Customer customer, BigDecimal startingBalance, int bankAssignedNumber, int pin){
        //TODO complete constructor
        //this.primary = customer.getID();
        this.balance = startingBalance;
        this.number = bankAssignedNumber;
        this.pin = pin;
    } 

    public BigDecimal deposit(BigDecimal amount){
        //TODO update and return new balance
        return null;
    }
    

}