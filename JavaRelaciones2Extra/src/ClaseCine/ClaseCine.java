/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseCine;

import ClasePelicula.ClasePelicula;
import Servicio.Servicio;

/**
 *
 * @author LILIANA
 */
public class ClaseCine {
    
    private Integer precioEntrada;
    private ClasePelicula pelicula;
    private Servicio sala;

    public ClaseCine() {
    }

    public ClaseCine(Integer precioEntrada, ClasePelicula pelicula, Servicio sala) {
        this.precioEntrada = precioEntrada;
        this.pelicula = pelicula;
        this.sala = sala;
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ClasePelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(ClasePelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Servicio getSala() {
        return sala;
    }

    public void setSala(Servicio sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "ClaseCine{" + "precioEntrada=" + precioEntrada + ", pelicula=" + pelicula + ", sala=" + sala + '}';
    }
    
    
    
    
}
