package com.tiagoperroni.projetofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.projetofullstack.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
