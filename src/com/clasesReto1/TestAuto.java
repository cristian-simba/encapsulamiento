package com.clasesReto1;

public class TestAuto {
	public static void main(String[] args) {
		// Instanciar
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		// Modificar
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2020);
		auto1.setPrecio(29490.00);
		
		auto2.setMarca("Nissan");
		auto2.setAnio(2019);
		auto2.setPrecio(30400.00);
		
		// Mostrar
		System.out.println("------ Auto 1 -------");
		System.out.println("marca: " + auto1.getMarca());
		System.out.println("año: " + auto1.getAnio());
		System.out.println("precio: " + auto1.getPrecio());
		System.out.println("------ Auto 2 -------");
		System.out.println("marca: " + auto2.getMarca());
		System.out.println("año: " + auto2.getAnio());
		System.out.println("precio: " + auto2.getPrecio());
	}
}
