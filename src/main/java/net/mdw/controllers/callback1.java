package net.mdw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.mdw.model.callback1.peticion.Callback1ClasePrincipal;

@RestController
@RequestMapping(path = "/callback1")
public class callback1 {

	@Autowired
	private simSisFinal simulador;

	@PostMapping("/method1")
	public ResponseEntity<?> method1(@RequestBody Callback1ClasePrincipal objetoRecibido) {

		try {
			// Aqui iria la llamada a la API.
			String respuesta = simulador.primerSimulador();

			if (respuesta.equals("1")) {
				return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
			} else if (respuesta.equals("2")) {
				return ResponseEntity.status(HttpStatus.ACCEPTED).body("2");
			} else {
				throw new Exception();
			}

		} catch (Exception ex) {
			System.out.println("error debug info");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
		}
	}

	@PostMapping("/method2")
	public ResponseEntity<?> method2(@RequestBody Callback1ClasePrincipal objetoRecibido) {
		try {
			// Aqui iria la llamada a la API.
			Callback1ClasePrincipal respuesta = simulador.segundoSimulador();

			if (objetoRecibido.getParam1().equals("hola")) {
				return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
			} else if (objetoRecibido.getParam1().equals("adios")) {
				return ResponseEntity.status(HttpStatus.ACCEPTED).body("2");
			} else {
				throw new Exception();
			}

		} catch (Exception ex) {
			System.out.println("error debug info");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
		}
	}

}
