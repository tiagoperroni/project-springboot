package com.tiagoperroni.projetofullstack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagoperroni.projetofullstack.entities.Order;
import com.tiagoperroni.projetofullstack.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order fidById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
