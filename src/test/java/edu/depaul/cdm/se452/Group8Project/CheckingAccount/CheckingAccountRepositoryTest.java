package edu.depaul.cdm.se452.Group8Project.CheckingAccount;
import edu.depaul.cdm.se452.Group8Project.checking.CheckingAccount;
import edu.depaul.cdm.se452.Group8Project.checking.CheckingAccountRepository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.hibernate.annotations.Check;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;





@SpringBootTest
public class CheckingAccountRepositoryTest {

@Autowired
private CheckingAccountRepository repo;


  @Test
  public void testLombok(){
    CheckingAccount ca1 = new CheckingAccount();
    ca1.setBalance(100.00);
    Double x = ca1.getBalance();
    CheckingAccount ca2 = new CheckingAccount(true);
    boolean b = ca2.isDebit();
    assertEquals("100.0", x.toString());
    assertEquals(true, b);
  }

  @Test
  public void testAddCheckingAccount(){
    CheckingAccount ca1 = new CheckingAccount();
    ca1.setAccountNumber(1234567);
    ca1.setPrimaryHolderId(5000);
    ca1.setBalance(100.00);
    ca1.setDebit(false);
    ca1.setPin(1234);
    long b4 = repo.count();
    repo.save(ca1);
    long af = repo.count();;
    assertEquals(0, b4);
    assertEquals(1, af);
  }

  @Test
  public void testUpdateCheckingAccount(){
      CheckingAccount ca1 = new CheckingAccount();
      ca1.setPrimaryHolderId(69);
      repo.save(ca1);
      CheckingAccount ca2 = repo.findById(1).orElse(new CheckingAccount());
      ca2.setAccountNumber(12345);
      ca2.setBalance(2000.00);
      repo.save(ca2);
      CheckingAccount ca3 = repo.findById(1).orElse(new CheckingAccount());
      assertEquals(69, ca3.getPrimaryHolderId());
      assertEquals(2000.0, ca3.getBalance()); 
  }

  @Test
  public void testDeleteCheckingAccount(){
    CheckingAccount ca1 = new CheckingAccount();
    CheckingAccount ca2 = new CheckingAccount();
    CheckingAccount ca3 = new CheckingAccount();
    repo.save(ca1);
    repo.save(ca2);
    repo.save(ca3);
    long before = repo.count();
    repo.deleteById(1);
    long after = repo.count();
    assertEquals(before, 3);
    assertEquals(after, 2);
  }


}
