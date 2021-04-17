package com.tw.controllers;

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
	
	@GetMapping(value = "/getTw")
	public String getTw() {
		return "PISÃO!!!!";
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
