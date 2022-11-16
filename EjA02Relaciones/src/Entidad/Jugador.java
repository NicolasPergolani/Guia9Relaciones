package Entidad;

import Entidad.Servicios.ServicioRdA;
import java.util.ArrayList;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica 
si está mojado o no el jugador). */

public class Jugador {

    private Integer ide;
    private String nombre;
    private String estado;
    ServicioRdA sr=new ServicioRdA();

    public Jugador() {
    }

    public Jugador(Integer ide, String nombre, String estado) {
        this.ide = ide;
        this.nombre = nombre;
        this.estado = estado;
    }


    public Integer getIde() {
        return ide;
    }

    public void setIde(Integer ide) {
        this.ide = ide;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = "seco";
    }

    @Override
    public String toString() {
        return "Jugador " + " ide: " + ide + " nombre: " + nombre;
    }

}
