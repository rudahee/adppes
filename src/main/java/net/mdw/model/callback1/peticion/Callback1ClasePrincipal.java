package net.mdw.model.callback1.peticion;

public class Callback1ClasePrincipal {

	private String param1;
	private String param2;

	private Callback1SubClase1 cb1s1;
	private Callback1SubClase2 cb1s2;
	
	public Callback1ClasePrincipal() {
		super();
		cb1s1 = new Callback1SubClase1();
		cb1s2  = new Callback1SubClase2();
	}
	
	public Callback1ClasePrincipal(String param1, String param2, Callback1SubClase1 cb1s1, Callback1SubClase2 cb1s2) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		this.cb1s1 = cb1s1;
		this.cb1s2 = cb1s2;
	}
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public Callback1SubClase1 getCb1s1() {
		return cb1s1;
	}
	public void setCb1s1(Callback1SubClase1 cb1s1) {
		this.cb1s1 = cb1s1;
	}
	public Callback1SubClase2 getCb1s2() {
		return cb1s2;
	}
	public void setCb1s2(Callback1SubClase2 cb1s2) {
		this.cb1s2 = cb1s2;
	}
	
}
