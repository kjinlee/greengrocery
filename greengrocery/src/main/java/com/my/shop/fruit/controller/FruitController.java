package com.my.shop.fruit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.my.shop.fruit.model.Fruit;

@RestController
public class FruitController {
	
	
	@GetMapping("/fruit")
	@ResponseStatus(value = HttpStatus.OK)
	public Fruit getFruitPrice(@RequestParam Fruit fruit) {
		fruit.setCategory("과일");
		fruit.setName("사과");
		fruit.setPrice("1500");
		
		return fruit;
	}
	
	
	
}








