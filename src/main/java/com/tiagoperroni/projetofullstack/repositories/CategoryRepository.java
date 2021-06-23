package com.tiagoperroni.projetofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.projetofullstack.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
