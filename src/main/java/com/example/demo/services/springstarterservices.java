package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.springstrater;
import com.example.demo.repository.springstraterrepository;

@Service
public class springstarterservices {
	@Autowired
	springstraterrepository repo;
	
	public springstrater insertion(@RequestBody  springstrater s) {
		
		return repo.save(s);
	}
	public Iterable<springstrater> insertall(@RequestBody List<springstrater > std) {
		
		return repo.saveAll(std);
	}
	public List<springstrater> getall(){
		
		return (List<springstrater>) repo.findAll();
	}
	public springstrater getbyemail(String email) {
		return repo.findByEmail(email);
	}
	public Optional<springstrater> getbyId(int id){
		return repo.findById(id);		
	}
	
	public String deletebyId(int id) {
		 repo.deleteById(id);
		 return "successfully deleted" + id;
	}
	//update
	
	public springstrater updateAll(springstrater emp) {
		
		int id = emp.getId();
		
		springstrater employ = repo.findById(id).get();
		
		employ.setId(emp.getId());
		employ.setRollno(emp.getRollno());
		employ.setName(emp.getName());
		employ.setGender(emp.getGender());
		employ.setEmail(emp.getEmail());
		employ.setPassword(emp.getPassword());
		
		return repo.save(employ);
	}
}
