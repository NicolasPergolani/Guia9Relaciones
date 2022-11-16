package eja02relaciones;

import Entidad.Servicios.ServicioJuego;
import Entidad.Servicios.ServicioJugador;
import Entidad.Servicios.ServicioRdA;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:


Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego*/
public class EjA02Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRdA datos = new ServicioRdA();
        datos.llenar();
        datos.Mostrar();

        ServicioJugador datos1 = new ServicioJugador();
        datos1.CantidadJugadores();
//        datos1.llenado();
        ServicioJuego sj = new ServicioJuego();
        sj.Juego(datos1.llenado());
    }

}
