package com.example.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.User.DAO.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
