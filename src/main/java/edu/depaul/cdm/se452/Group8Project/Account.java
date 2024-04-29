package edu.depaul.cdm.se452.Group8Project;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Account{
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    protected Integer id; // in-house number

    //TODO define relationship to account
    protected Integer prim; // the primary account holder
    
    private Double balance;
    /*protected Integer number; // customer account number
    
    protected Integer pin;
    */

}