package com.rkn.spring.apps.Additions;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class AdditionsApplication {
	
	
	@RequestMapping("/add")
	public String prompt(@RequestParam String id1, @RequestParam String id2) {
		//example url will look like http://localhost:8080/add?id1=1&id2=2
		
		int sum= Integer.parseInt(id1)+Integer.parseInt(id2);
		return "The sum is : "+sum;
	}

	public static void main(String[] args) {
		SpringApplication.run(AdditionsApplication.class, args);
	}

}
