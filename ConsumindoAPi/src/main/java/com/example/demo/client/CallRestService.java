package com.example.demo.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Person;

@Component
public class CallRestService implements CommandLineRunner {

	private static void callRestService() {
		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject("https://apirest-pacientes.herokuapp.com/api/pacientes/1",
				Person.class);
		System.out.println("O nome da pessoa é: " + person.getNome());
	}

	@Override
	public void run(String... args) throws Exception {
		callRestService();
		
	}
}
