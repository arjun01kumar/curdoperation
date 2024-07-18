package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.springstrater;

@Repository
public interface springstraterrepository extends CrudRepository<springstrater, Integer>{

	springstrater findByEmail(String email);
  
}
