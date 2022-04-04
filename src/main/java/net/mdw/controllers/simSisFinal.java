package net.mdw.controllers;

import org.springframework.stereotype.Service;

import net.mdw.model.callback1.peticion.Callback1ClasePrincipal;
import net.mdw.model.callback1.peticion.Callback1SubClase1;

@Service
public class simSisFinal {

	
	public String primerSimulador() {
		return "1";
	}
	
	public Callback1ClasePrincipal segundoSimulador() {
		Callback1SubClase1 cbs1 = new Callback1SubClase1();
		cbs1.setSub1param1("a");
		cbs1.setSub1param2("b");

		return new Callback1ClasePrincipal("a", "b", cbs1, null);
	}
}
