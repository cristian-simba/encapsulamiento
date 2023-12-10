package com.clasesReto2;

public class Mensajeria {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void saludar() {
        System.out.println("Holaaa");
    }

    public void saludarAmigo() {
        System.out.println("Hola " + nombre + " " + apellido);
    }
}
