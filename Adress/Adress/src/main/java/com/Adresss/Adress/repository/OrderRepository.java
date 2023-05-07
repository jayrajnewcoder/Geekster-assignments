package com.Adresss.Adress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Adresss.Adress.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
