package ar.edu.uno.poo2.grafos.core;

import java.awt.Point;

public class Vertice {
	
	private String nombre;
	//para más adelante
	private int x;
	private int y;
	
	public Vertice(String nombre) {
		this.setNombre(nombre);
	}
	
	//Por el momento no se usa
	public Vertice(String nombre, Point p) {
		this(nombre);
		this.setX((int)p.getX());
		this.setY((int)p.getY());
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
