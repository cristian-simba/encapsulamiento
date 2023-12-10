package com.clasesReto1;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona(); // Instancia	
		Persona p2 = new Persona();
		// Acceder a los atributos
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
		
		p.setNombre("David");
		p.setEdad(21);
		p.setEstatura(1.79);
		
		System.out.println("-------------------------");
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
		
		System.out.println("-------------------------");
		p2.setNombre("Shirley");
		System.out.println("nombre1: "+p.getNombre());
		System.out.println("nombre2: " + p2.getNombre());
		
	}
}
