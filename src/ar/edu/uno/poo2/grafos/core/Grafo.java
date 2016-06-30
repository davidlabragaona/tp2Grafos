package ar.edu.uno.poo2.grafos.core;

import java.util.*;

public class Grafo {
	
	int cantVertices;
	int matrizAdyacencia[][];
	double probabilidad;
	Random aleatorio = new Random();
	
	
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
		double p = this.getProbabilidad();
		
		matrizAdyacencia = new int[n][n];
		
		//Llenamos la matriz de adyacencia
		for (int i = 0; i < n - 1; i++) {
			matrizAdyacencia[i][i] = 0;
			for (int j = i + 1; j < n; j++) {
				if (aleatorio.nextDouble() < p) {
					matrizAdyacencia[i][j] = 1;
					matrizAdyacencia[j][i] = 1;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrizAdyacencia.length; i++) {
			for (int j = 0; j < matrizAdyacencia[i].length; j++) {
				sb.append(matrizAdyacencia[i][j]);
				if (j != matrizAdyacencia[i].length + 1) {
					sb.append(" ");
				}
			}
			if (i != matrizAdyacencia.length - 1)
				sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Grafo g = new Grafo(10, 0.8);
		System.out.println(g);
	}
}
