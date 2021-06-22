package com.tiagoperroni.projetofullstack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagoperroni.projetofullstack.entities.User;
import com.tiagoperroni.projetofullstack.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User fidById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
