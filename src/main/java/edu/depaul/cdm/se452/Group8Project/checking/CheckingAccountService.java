package edu.depaul.cdm.se452.Group8Project.checking;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckingAccountService {
  
  @Autowired
  private CheckingAccountRepository repo;

  //TODO add logging to methods

  public List<CheckingAccount> list(){
    List<CheckingAccount> listOfCA = StreamSupport.stream(repo.findAll().spliterator(), false).collect(Collectors.toList());
    return listOfCA;
  }

  public CheckingAccount save(CheckingAccount account){
    repo.save(account);
    return account;
  }

  public void delete(long id){
    repo.deleteById((int) id);
  }



}
