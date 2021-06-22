package com.tiagoperroni.projetofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.projetofullstack.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
