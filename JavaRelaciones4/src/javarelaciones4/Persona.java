/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones4;

/**
 *
 * @author LILIANA
 */
public class Persona {

   
  private String nombre;
  private String apellido;
  private Perro perrito;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Perro perrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perrito = perrito;
    }

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

    public Perro getPerrito() {
        return perrito;
    }

    public void setPerrito(Perro perrito) {
        this.perrito = perrito;
    }

    @Override
    public String toString() {
        return "ClasePersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", perrito=" + perrito + '}';
    }
  
   

   
}
