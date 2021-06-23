package com.tiagoperroni.projetofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.projetofullstack.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
