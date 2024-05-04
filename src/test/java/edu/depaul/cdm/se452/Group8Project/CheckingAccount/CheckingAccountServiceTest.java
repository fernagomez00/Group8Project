package edu.depaul.cdm.se452.Group8Project.CheckingAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.depaul.cdm.se452.Group8Project.checking.CheckingAccount;
import edu.depaul.cdm.se452.Group8Project.checking.CheckingAccountService;

@SpringBootTest
public class CheckingAccountServiceTest {
  
  @Autowired
  private CheckingAccountService service;

  @Test
  public void testNewCheckingAccount(){
    CheckingAccount ca1 = new CheckingAccount();
    CheckingAccount ca2 = new CheckingAccount();
    CheckingAccount ca3 = new CheckingAccount();
    CheckingAccount ca = new CheckingAccount();
 
    service.save(ca1);
    service.save(ca2);
    service.save(ca3);
    ca.setAccountNumber(1234);
    ca.setPrimaryHolderId(2000);
    ca.setBalance(100.00);
    long before = service.list().size();
    service.save(ca);
    long after = service.list().size();
    assertEquals(3, before);
    assertEquals(4, after);
  }

  @Test
  public void testListCheckingAccounts(){
    CheckingAccount ca1 = new CheckingAccount();
    CheckingAccount ca2 = new CheckingAccount();
    CheckingAccount ca3 = new CheckingAccount();
    CheckingAccount ca = new CheckingAccount();
    ca1.setAccountNumber(23456789);
    ca1.setPrimaryHolderId(2010);
    ca1.setBalance(100.00);
    ca1.setDebit(false);
    ca1.setPin(2345);
    service.save(ca1);
    service.save(ca2);
    service.save(ca3);
    ca.setAccountNumber(12345678);
    ca.setPrimaryHolderId(2000);
    ca.setBalance(100.00);
    ca.setDebit(false);
    ca.setPin(1234);
    service.save(ca);
    ArrayList<CheckingAccount> list = new ArrayList<>();
    list = (ArrayList<CheckingAccount>)service.list();
    for(CheckingAccount l:list){
      System.out.println("ID " + l.getId());
      System.out.println("Account Number: " + l.getAccountNumber());
      System.out.println("Balance " + l.getBalance());
    }
  }

  @Test
  public void testUpdateCheckingAccount(Integer id){
    
  }

  
}
