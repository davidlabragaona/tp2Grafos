package ar.edu.uno.poo2.grafos.core;

public class Grafo {
	
	int cantVertices;
	int matrizAdyacencia[][];
	double probabilidad;
	double densidad;
	
	
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
		/*
		 * Calculamos la cantidad de aristas
		 * que se pueden formar dada la cantidad de vertices
		 * y la probabilidad asignada
		 */
		
		// n Cantidad de vertices
		// p Probabilidad
		// m Aristas
		// G(n,p)
		int n = this.getCantVertices();
		System.out.println("Cantidad de vertices: " + n);
		double p = this.getProbabilidad();
		System.out.println("probabilidad: " + p);
		int m = (int)(n * (n - 1) * (double)(p / 2));
		System.out.println("Cantidad de aristas: " + m);
		
		// grado promedio
		double gp = p * ( n - 1);
		System.out.println("Grado promedio: " + gp);
		
		// grado máximo
		int gm = (int)p * n;
		System.out.println("Grado máximo: " + gm);
		
	}
	
	public static void main(String[] args) {
		Grafo g = new Grafo(4, .9);
	}
}
