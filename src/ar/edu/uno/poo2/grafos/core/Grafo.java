package ar.edu.uno.poo2.grafos.core;

import java.util.*;

public class Grafo {
	
	int cantVertices;
	int matrizAdyacencia[][];
	double probabilidad;
	
	
	public Grafo(int cantVertices, double probabilidad) {
		this.setCantVertices(cantVertices);
		this.setProbabilidad(probabilidad);
		this.inicializarGrafo();
	}
	
	/**
	 * @return the cantVertices
	 */
	public int getCantVertices() {
		return cantVertices;
	}
	/**
	 * @param cantVertices the cantVertices to set
	 */
	private void setCantVertices(int cantVertices) {
		this.cantVertices = cantVertices;
	}
	/**
	 * @return the probabilidad
	 */
	private double getProbabilidad() {
		return probabilidad;
	}
	/**
	 * @param probabilidad the probabilidad to set
	 */
	private void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}
	
	private void inicializarGrafo() {
		int n = this.getCantVertices();
		List<Vertice> vertices = new ArrayList<Vertice>(n);
		
		//Creamos los vértices
		for (int i = 0; i < n; i++)
			vertices.add(new Vertice("v" + (i+1)));
		
		System.out.println("Cantidad de vertices: " + n);
		
		int m = n * (n - 1);
		
		
		double pc = new Random().nextFloat() * this.getProbabilidad();
		System.out.println("probabilidad: " + pc);
		//m = Math.round((float)(n * (n - 1) * (pc / 2.0)));
		System.out.println("Cantidad de aristas: " + m);
		
		// grado promedio
		double gp = pc * (n - 1);
		System.out.println("Grado promedio: " + gp);
		
		// grado máximo
		int gm = (int)(pc * n);
		System.out.println("Grado máximo: " + gm);
	}
	
	public static void main(String[] args) {
		Grafo g = new Grafo(4, 1);
	}
}
