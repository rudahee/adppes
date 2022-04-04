package net.mdw.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path = "/callback2")
public class callback2 {

	@Autowired
	private simSisFinal simulador;

	@PostMapping("/method1")
	public ResponseEntity<?> method1(@RequestBody String objetoRecibidoFormatoJson) {
		try {
			ObjectMapper mapper = new ObjectMapper();
	        
	        
	        @SuppressWarnings("unchecked")
			HashMap<String, Object> map = mapper.readValue(objetoRecibidoFormatoJson, HashMap.class);
			//map.replace("param3", ((ArrayList) map.get("param3")).stream().toArray()); 
	        
	        //llamada a la api aqui
			
			System.out.println(map);
			String respuesta = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

			return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
		

		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
		}
	}
}
