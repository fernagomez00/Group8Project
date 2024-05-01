package edu.depaul.cdm.se452.Group8Project.account;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository<T extends Account> extends JpaRepository<T,Integer> {

 }
