package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Controller {
	@GetMapping("/")
	public String index() {
		List<Flower> flowers = new ArrayList<Flower>();
		flowers.add(new Cactus());
		flowers.add(new Romashka());
		StringBuilder content = new StringBuilder(new String());
		for (Flower elem: flowers) {
			content.append(elem.getInfo()).append(" ");
		}
		return content.toString();
	}

}
