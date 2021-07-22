package com.my.shop.vegetable.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.shop.fruit.model.Fruit;

@RestController
public class VegetableController {
	
	
	@GetMapping("/vege")
	public ResponseEntity getFruitPrice(@RequestParam Fruit fruit) {
		
		
		return ResponseEntity.ok(fruit);
	}
	
	
	
}








