package com.Alejandro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerProof1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerProof1Application.class, args);
	}

	
	 @RequestMapping("/")
	    public String HelloWorld() {
	        return "¡Hellow world!";
	    }
}
