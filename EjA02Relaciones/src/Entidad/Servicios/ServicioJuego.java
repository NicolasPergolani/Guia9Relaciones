/*
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidad.Servicios;

import Entidad.Jugador;
import Entidad.RevolverdeAgua;
import java.util.ArrayList;
import java.util.List;

public class ServicioJuego {

    ServicioRdA rv = new ServicioRdA();
    ServicioJugador sj = new ServicioJugador();
    Jugador j = new Jugador();
    RevolverdeAgua ra = new RevolverdeAgua();

    public void Juego(ArrayList jugadores) {
        int cont = 0;

        do {
            rv.siguientechorro();

            if (!mojar) {
////(jugadores.get(cont).toString()) +
                System.out.println(jugadores.get(cont).toString() + "Safo va el proximo");
                cont++;

            } else {

////                System.out.println(jugadores.contains(j));
                System.out.println(jugadores.get(cont).toString());

                System.out.println("Se mojo");
                break;
            }

        } while (!mojar);
//        for (int i = 0; i < jugadores.size(); i++) {
//            if (rv.mojar()) {
//                System.out.println(jugadores.get(i).toString() + " se mojo");
//                break;
//            } else {
//                System.out.println(jugadores.get(i).toString() + " esta seco");
//            }
//            if (i == jugadores.size()) {
//                i = 0;
//
//            }
//        }
    }
}
