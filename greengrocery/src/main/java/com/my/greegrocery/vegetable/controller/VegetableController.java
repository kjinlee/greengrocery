package com.my.greegrocery.vegetable.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.my.greegrocery.vegetable.model.Vegetable;

@RestController
public class VegetableController {
	
	private Map<String, Vegetable> vegeMap;
	
	@PostConstruct
	public void init() {
		vegeMap = new HashMap<String, Vegetable>();
		vegeMap.put("1", new Vegetable("1", "채소", "오이", "1800원"));
		vegeMap.put("2", new Vegetable("2", "채소", "양파", "500원"));
		vegeMap.put("3", new Vegetable("3", "채소", "고추", "3000원"));
		vegeMap.put("4", new Vegetable("4", "채소", "대파", "1200원"));
		vegeMap.put("5", new Vegetable("5", "채소", "마늘", "400원"));
	}
	
	@GetMapping("/vege/{id}")
	public Vegetable getFruit(@PathVariable("id") String id) {
		return vegeMap.get(id);
	}
	
	
	@GetMapping("/vege/all")
	public List<Vegetable> getFruitList(){
		return new ArrayList<Vegetable>(vegeMap.values());
	}
	
	
	

}