package Entidad.Servicios;

import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*El número de jugadores será decidido por el usuario, pero 
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. 
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Jugador j1 = new Jugador();
    ArrayList<Jugador> jugadores = new ArrayList();
    int cantidad;
    int i = 0;

    public void CantidadJugadores() {

        System.out.println("Ingrese la cantidad de jugadores... (1 - 6)");
        cantidad = leer.nextInt();
        if ((cantidad < 0 && cantidad > 6 )) {
            System.out.println("Cantidad invalida... se tomara como cantidad a 6 jugadores...");
            cantidad = 6;
        }
    }

    public Jugador jugadores() {

        System.out.println("Ingrese el nombre del Jugador N° " + (i + 1));
        j1.setIde((i + 1));
        j1.setNombre(leer.next());
        j1.setEstado("Seco");

        return new Jugador(j1.getIde(), j1.getNombre(), j1.getEstado());
    }

    public ArrayList llenado() {
        do {

            jugadores.add(jugadores());
            i++;
        } while ((cantidad > 1) && (cantidad != i));
//        for (Jugador aux : jugadores) {
//            System.out.println(aux);
//        }
        return jugadores;
    }

}
