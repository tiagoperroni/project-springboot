package com.tiagoperroni.projetofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.projetofullstack.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
