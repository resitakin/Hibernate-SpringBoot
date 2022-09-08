
package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductsDemo {
	@GetMapping("/")
	public String get() {
		return "laptop";
		
	}
	
	@GetMapping("/product")
	
	public String get2() {
		return "laptop56";
	}
	

}
