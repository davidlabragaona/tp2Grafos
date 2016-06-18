package ar.edu.uno.practicas;
import java.util.*;

public class Arista {
	private Vertice a;
	private Vertice b;
	private Double probabilidad;
	
	public Arista(Vertice a, Vertice b) {
		//Ocultamos los métodos para setear a y b.
		//Solamente se admite su pasaje al momento de
		//creación de la arista.
		this.setA(a); this.setB(b);
		setProbabilidad(Math.random());
	}

	//Getters & Setters
	public Vertice getA() {
		return a;
	}
	
	private void setA(Vertice a) {
		this.a = a;
	}
	
	public Vertice getB() {
		return b;
	}
	
	private void setB(Vertice b) {
		this.b = b;
	}
	
	public Double getProbabilidad() {
		return probabilidad;
	}
	
	private void setProbabilidad(Double probabilidad) {
		this.probabilidad = probabilidad;
	}

}
