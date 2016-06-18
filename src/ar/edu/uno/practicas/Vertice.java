package ar.edu.uno.practicas;

import java.util.ArrayList;

public class Vertice {
	private ArrayList<Arista> aristas;
	private String nombre;
	
	public Vertice(String n) {
		this.setNombre(n);
		aristas = new ArrayList<Arista>();
	}
	
	private void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void AddArista(Arista a) {
		aristas.add(a);
	}
}
