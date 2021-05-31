package com.tw.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/tw")
public class TwController {

	@Value("${testeVariavelDeAmbiente.teste1}")
	private String testeVariavelDeAmbiente1;
	
	@Value("${testetw}")
	private String testetw;
	
	
	@GetMapping(value = "/testeVariavelDeAmbiente")
	public String testeVariavelDeAmbiente() {

		String javaHome = System.getenv("JAVA_HOME");
		String dbName = System.getenv("RDS_DB_NAME");
		String userName = System.getenv("RDS_USERNAME");
		String password = System.getenv("RDS_PASSWORD");
		
		String environmentid = System.getenv("elasticbeanstalk:environment-id");
		String environmentname = System.getenv("environment-name");
		String teste3 = System.getenv("teste3");
		String tw = System.getenv("AWSEBDBUser");
		
		Map<String, String> env = System.getenv();
		
		String testeVariavelDeAmbiente2 = System.getenv("testeVariavelDeAmbiente.teste2");

		return "testeVariavelDeAmbiente = " + testeVariavelDeAmbiente1 +
					" \n javaHome = " + javaHome +
					" \n dbName = " + dbName +
					" \n dbName = " + userName +
					" \n password = " + password +
					
					" \n environmentid = " + environmentid +
					" \n environmentname = " + environmentname +
					" \n teste3 = " + teste3 +
					" \n tw = " + tw + 					
					" \n testeVariavelDeAmbiente2 = " + testeVariavelDeAmbiente2 +
					" \n testetw = " + testetw +
					"\n env = "+ env
					;
	}

	@PostMapping(value = "/PostTw/{name}")
	public String PostTw(
				@ApiParam(value = "Informe um nome para o Tw", required = true) @PathVariable(value = "name") String name) {
		return "O nome do Tw agora é = " + name;
	}

	@PostMapping(value = "/PostTwResponseEnityOk/{name}")
	public ResponseEntity<?> PostTwResponseEnityOk(
				@ApiParam(value = "Informe um nome para o Tw", required = true) @PathVariable(value = "name") String name) {
		return ResponseEntity.ok("O nome do Tw agora é = " + name);
	}

	@DeleteMapping(value = "/delTw")
	public String delTw() {
		return "PISÃO!!!!";
	}

	@PutMapping(value = "/putTw")
	public String putTw() {
		return "PISÃO!!!!";
	}

	@PatchMapping(value = "/PatchTw")
	public String PatchTw() {
		return "PISÃO!!!!";
	}
}
