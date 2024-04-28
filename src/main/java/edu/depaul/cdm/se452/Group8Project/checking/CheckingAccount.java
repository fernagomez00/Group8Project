package edu.depaul.cdm.se452.Group8Project.checking;


import edu.depaul.cdm.se452.Group8Project.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name = "checkingaccount")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CheckingAccount extends Account{
  private boolean debit;

}
