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
package relaciones_ej_03;

import Entidades.Baraja;
import Servicios.ServicioCartas;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Relaciones_ej_03 {

    public static void main(String[] args) {
        ServicioCartas sc = new ServicioCartas();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LinkedList<Baraja> mazo = sc.crear();
        List<Baraja> mesa = new LinkedList();
        int opcion;
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Opcion 1: Mezclar");
            System.out.println("2 - Opcion 2: Cartas Disponibles");
            System.out.println("3 - Opcion 3: Pedir carta");
            System.out.println("4 - Opcion 4: Cartas en mesa");
            System.out.println("5 - Opcion 5: Cartas en la baraja");
            System.out.println("6 - Opcion 6: Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sc.barajar(mazo);
                    break;
                case 2:
                    sc.cartasDisponibles(mazo);
                    break;
                case 3:
                    sc.darCartas(mazo, mesa);
                    break;
                case 4:
                    sc.cartasMonton(mesa);
                    break;
                case 5:
                    sc.mostrarBaraja(mazo);
                    break;
                case 6:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 6));
    }

}
