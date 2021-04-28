package com.bmid.camel.project.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.bmid.camel.project.dto.Items;

@Service
public class ItemsService {

	public static List<Items> items = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		items.add(new Items(1l,"Camisa",2,20000));
		items.add(new Items(2l,"Pantalon",1,40000));
	}
	
	public List<Items> lista(){
		return items;
	}
	
}
