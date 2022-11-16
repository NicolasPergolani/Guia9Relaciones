/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioJugador {
    
    ServicioRevolver rs = new ServicioRevolver();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Jugador> jugadores = new ArrayList();
    Jugador sJ = new Jugador();
    boolean seMojo = false;

    public List cargarJug() {

        String opcion = "";
        System.out.println("Vamos a cargar a los suicidas ");
        do {
            Jugador j = new Jugador();
            System.out.println("Ingrese el nombre del jugador");
            j.setNombre(leer.next());
            System.out.println("Ingrese el ID del jugador");
            j.setId(leer.nextInt());
            System.out.println("Desea cargar otro jugador?(si/no");
            opcion = leer.next();
            jugadores.add(j);
        } while (!opcion.equalsIgnoreCase("no"));
        return jugadores;
    }

    public boolean disparoRevolver(Revolver r) {
        
        for (Jugador aux : jugadores) {
            if (rs.mojar(r)) {
                System.out.println(aux.getNombre() + "se mojo");
                seMojo = true;

            } else {
                System.out.println(aux.getNombre() + "sigue seco");
                System.out.println("Vamos a la siguiente vuelta");

            }seMojo=false;
           
        }
        return seMojo;
    }
}
