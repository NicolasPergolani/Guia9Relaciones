/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseEscpectador;

/**
 *
 * @author LILIANA
 */
public class ClaseEspectador {
    
    private String nombre;
    private Integer edad;
    private Double dineroDisponible;

    public ClaseEspectador() {
    }

    public ClaseEspectador(String nombre, Integer edad, Double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "ClaseEspectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }
    
    
    
    
    
    
}
