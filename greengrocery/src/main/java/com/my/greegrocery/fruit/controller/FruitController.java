package com.my.greegrocery.fruit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.my.greegrocery.fruit.model.Fruit;

@RestController
public class FruitController {
	
	private Map<String, Fruit> fruitMap;
	
	@PostConstruct
	public void init() {
		fruitMap = new HashMap<String, Fruit>();
		fruitMap.put("1", new Fruit("1", "과일", "사과", "5000원"));
		fruitMap.put("2", new Fruit("2", "과일", "배", "7000원"));
		fruitMap.put("3", new Fruit("3", "과일", "자두", "3000원"));
		fruitMap.put("4", new Fruit("4", "과일", "수박", "10000원"));
		fruitMap.put("5", new Fruit("5", "과일", "망고", "20000원"));
	}
	
	@GetMapping("/fruit/{id}")
	public Fruit getFruit(@PathVariable("id") String id) {
		return fruitMap.get(id);
	}
	
	
	@GetMapping("/fruit/all")
	public List<Fruit> getFruitList(){
		return new ArrayList<Fruit>(fruitMap.values());
	}
	
	
}








