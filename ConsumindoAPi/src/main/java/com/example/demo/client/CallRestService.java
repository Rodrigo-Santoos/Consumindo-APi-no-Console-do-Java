package com.example.demo.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Person;

@Component
public class CallRestService implements CommandLineRunner {

	private static void callRestService() {
		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject("https://apirest-pacientes.herokuapp.com/api/pacientes/2",
				Person.class);
		System.out.println("Paciente com a id " + person.getId());
		System.out.println("Nome: " + person.getNome());
		System.out.println("Idade: " + person.getIdade());
		System.out.println("Sexo: " + person.getSexo());
		System.out.println("Telefone: " + person.getTelefone());
		System.out.println("Endereço: " + person.getEndereco());
		System.out.println("Estado Civil: "  + person.getEstado_civil());
		System.out.println("Cep: " + person.getCep());
		System.out.println("Local Nascimento: " + person.getLocal_nascimento());
		System.out.println("Historico do Paciente: " + person.getHistorico_paciente());
	}

	@Override
	public void run(String... args) throws Exception {
		callRestService();
		
	}
}
