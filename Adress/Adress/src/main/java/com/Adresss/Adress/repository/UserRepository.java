package com.Adresss.Adress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Adresss.Adress.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
