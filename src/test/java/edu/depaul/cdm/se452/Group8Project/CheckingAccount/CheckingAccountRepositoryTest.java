package edu.depaul.cdm.se452.Group8Project.CheckingAccount;
import edu.depaul.cdm.se452.Group8Project.checking.CheckingAccount;
import edu.depaul.cdm.se452.Group8Project.checking.CheckingAccountRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;
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
    ca1.setId(1);
    ca1.setBalance(100.00);
    ca1.setDebit(false);
    long b4 = repo.count();
    repo.save(ca1);
    long af = repo.count();;
    assertEquals(0, b4);
    assertEquals(1, af);
  }
  
}
