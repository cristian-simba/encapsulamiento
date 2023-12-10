package com.clasesReto3;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.setBase(10);
		r1.setAltura(20);
		
		r2.setBase(20);
		r2.setAltura(90);
		
		int area1 = r1.calcularArea();
		int perimetro1 = r1.calcularPerimetro();
		int area2 = r2.calcularArea();
		int perimetro2 = r2.calcularPerimetro();
		
		
		System.out.println("--- Areas ---");
		System.out.println("Area del Rectangulo 1: " + area1);
		System.out.println("Area del Rectangulo 2: " + area2);
		System.out.println("-- Perimetros ---");
		System.out.println("Perimetro del Rectangulo 1: " + perimetro1);
		System.out.println("Perimetro del Rectangulo 2: " + perimetro2);
	}
}
