/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicios;

import Entidades.Baraja;
import Enum.Palos;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServicioCartas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//     List<Baraja> mazo = new LinkedList();
//     List<Baraja> mesa = new LinkedList();
    Baraja b1 = new Baraja();

    public LinkedList<Baraja> crear() {
        LinkedList<Baraja> mazo = new LinkedList();
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                mazo.add(new Baraja(i, Palos.BASTO));

            }

        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                mazo.add(new Baraja(i, Palos.ORO));

            }

        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                mazo.add(new Baraja(i, Palos.ESPADA));

            }

        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                mazo.add(new Baraja(i, Palos.COPA));

            }

        }

        return mazo;
    }

    public void barajar(List mazo) {
        Collections.shuffle(mazo);
        for (Object aux : mazo) {
            System.out.println(aux);
        }
    }

    public void siguienteCarta(List  mazo, List mesa) {

        if (mazo.isEmpty()) {
            System.out.println("No quedan cartas en la baraja");
        } else {
//            Collections.lastIndexOfSubList(mazo, mesa);
            
           mesa.add(mazo.get((int)Math.random()*10));
           mazo.removeAll(mesa);
        }

    }

    /*• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    
     */
    public void cartasDisponibles(List mazo) {
        System.out.println("Las cartas disponibles son: " + mazo.size());
    }

    /*
    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
     */
    public void darCartas(List mazo, List mesa) {
//        List<Baraja> mano = new LinkedList();
        System.out.println("Cuantas cartas desea pedir: ");
        int opc = leer.nextInt();
        if (mazo.size() > opc) {
            System.out.println("Se le entregaran las cartas");
            for (int i = 0; i < opc; i++) {
                siguienteCarta(mazo, mesa);
            }

        } else {
            System.out.println("No hay suficientes cartas en la baraja");
        }
    }

    /*
    cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
     */
    public void cartasMonton(List mesa) {
        if (mesa.isEmpty()) {
            System.out.println("No hay ninguna carta en la mesa");
        } else {
            for (Object aux : mesa) {
                System.out.println("Las cartas dadas son: " + aux);
            }
        }

    }

    /*
    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja(List mazo) {
        if (mazo.isEmpty()) {
            System.out.println("No quedan cartas en la baraja");

        } else {
            for (Object aux : mazo) {
                System.out.println("Las cartas dadas son: " + aux);
            }
        }
        System.out.println(mazo.size());
    }
}
