/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioJuego {

    ServicioJugador sJ = new ServicioJugador();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServicioRevolver rs = new ServicioRevolver();

    public void juego(List jugadores, Revolver r) {
        int cont=0;
        if (rs.mojar(r)==false) {
            sJ.disparoRevolver(r);
            System.out.println(sJ.jugadores.get(cont).getNombre()+"No se mojo vamos al siguiente disparo");
            System.out.println(r.getPosAc());
            System.out.println(r.getPosAg());
            do {
                rs.siguienteChorro(r);
                System.out.println("Volvemos a intentar");

            } while (!sJ.disparoRevolver(r));
//            if (mojar()==false) {
//               System.out.println(sJ.jugadores.get(cont).getNombre()+"No se mojo vamos al siguiente disparo");
//               cont++;
//                if (cont==sJ.jugadores.size()) {
//                    cont=0;
//                    
//                }
//            }else{
//                 System.out.println(sJ.jugadores.get(cont).getNombre()+"se cago mojando");
//            }
//        }
        
    }
}
}
