package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.springstrater;
import com.example.demo.services.springstarterservices;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200")
public class springstartercontroller {
@Autowired
springstarterservices services;
@PostMapping("/insert")
	public springstrater insertion(@RequestBody springstrater s) {
		return services.insertion(s);
	}

@PostMapping("/insertall")
	public Iterable<springstrater> stdinsert(@RequestBody List<springstrater> std) {
		return services.insertall(std);
	}
	@GetMapping("/getAll")
	public List<springstrater>getall(){
		return services.getall();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<springstrater> getbyid(@PathVariable int id) {
		
		return services.getbyId(id);
	}
	@DeleteMapping("/deletebyid/{id}")
	public  String deletebyId(@PathVariable int id) {
		return services.deletebyId(id);
	}
	@GetMapping("/findbyemail/{email}")
	public springstrater findByEmail(@PathVariable String email) {
		return services.getbyemail(email);
	}
	//update
	@PutMapping("/updateall")
	public springstrater updateAll(@RequestBody springstrater emp) {
		return services.updateAll(emp);
	}
}
