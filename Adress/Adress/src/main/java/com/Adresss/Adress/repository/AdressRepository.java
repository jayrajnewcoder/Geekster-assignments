package com.Adresss.Adress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Adresss.Adress.model.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress,Integer >{

}
