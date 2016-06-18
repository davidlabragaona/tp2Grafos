package ar.edu.uno.practicas;
import java.util.*;

public class Arista {
	private Vertice a;
	private Vertice b;
	private Double probabilidad;
	
	private ArrayList<Vertice> vertices;
	
	public Arista(){
		setProbabilidad(Math.random());
	}

	//Getters & Setters
	public Vertice getA() {
		return a;
	}
	public void setA(Vertice a) {
		this.a = a;
	}
	public Vertice getB() {
		return b;
	}
	public void setB(Vertice b) {
		this.b = b;
	}
	public Double getProbabilidad() {
		return probabilidad;
	}
	public void setProbabilidad(Double probabilidad) {
		this.probabilidad = probabilidad;
	}
	

}
