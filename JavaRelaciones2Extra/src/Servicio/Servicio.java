/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import ClaseCine.ClaseCine;
import ClaseEscpectador.ClaseEspectador;
import ClasePelicula.ClasePelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    List<ClaseEspectador> espectadores = new ArrayList();

    public void salaEspectadores() {

        String letra = "";

        do {

            ClaseEspectador E1 = new ClaseEspectador();
            System.out.println("ingrese el nombre del espectador ");
            E1.setNombre(leer.next());
            System.out.println("ingrese su edad  ");
            E1.setEdad(leer.nextInt());
            System.out.println("Cuanto Dinero tiene disponible?");
            E1.setDineroDisponible(leer.nextDouble());
            espectadores.add(E1);

            System.out.println("desea ingresar otro espectador?(s/n");
            letra = leer.next();

        } while (letra.equalsIgnoreCase("s"));

    }
    ClasePelicula peliculaNueva = new ClasePelicula();
    ClaseCine c1 = new ClaseCine();

    public void Pelicula() {

        System.out.println("ingrese nombre de pelicula");

        peliculaNueva.setTituloPelicula(leer.next());

        System.out.println("ingrese duracion de pelicula");
        peliculaNueva.setDuracionPelicula(leer.nextDouble());

        System.out.println("ingrese nombre de director");
        peliculaNueva.setDirectorPelicula(leer.next());

        System.out.println("ingrese edad minima para la pelicula");
        peliculaNueva.setEdadMinima(leer.nextInt());

        System.out.println(peliculaNueva);
        System.out.println("Ingrese el precio de la entrada");
        c1.setPrecioEntrada(leer.nextInt());
    }

    public void ubicacionEspectadores() {

        String[][] sala = new String[8][6];
        //le colocamos el i con 8 para que arranque en forma descendente

        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 6; j++) {

                if (j == 0) {
                    sala[i][j] = " " + "A" + (i + 1);
                } else if (j == 1) {
                    sala[i][j] = " " + "B" + (i + 1);
                } else if (j == 2) {
                    sala[i][j] = " " + "C" + (i + 1);
                } else if (j == 3) {
                    sala[i][j] = " " + "D" + (i + 1);
                } else if (j == 4) {
                    sala[i][j] = " " + "E" + (i + 1);
                } else if (j == 5) {
                    sala[i][j] = " " + "F" + (i + 1);
                }

            }
        }
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 7; j++) {
//                if (i == 0) {
//                    sala[i][j] = " " + "A" + (8);
//                    sala[i][j + 1] = " " + "B" + (8);
//                    sala[i][j + 2] = " " + "C" + (8);
//                    sala[i][j + 3] = " " + "D" + (8);
//                    sala[i][j + 4] = " " + "E" + (8);
//                    sala[i][j + 5] = " " + "F" + (8);
//                } else if (i == 1) {
//                    sala[i][j] = " " + "A" + (7);
//                    sala[i][j + 1] = " " + "B" + (7);
//                    sala[i][j + 2] = " " + "C" + (7);
//                    sala[i][j + 3] = " " + "D" + (7);
//                    sala[i][j + 4] = " " + "E" + (7);
//                    sala[i][j + 5] = " " + "F" + (7);
//                } else if (i == 2) {
//                    sala[i][j] = " " + "A" + (6);
//                    sala[i][j + 1] = " " + "B" + (6);
//                    sala[i][j + 2] = " " + "C" + (6);
//                    sala[i][j + 3] = " " + "D" + (6);
//                    sala[i][j + 4] = " " + "E" + (6);
//                    sala[i][j + 5] = " " + "F" + (6);
//                } else if (i == 3) {
//                    sala[i][j] = " " + "A" + (5);
//                    sala[i][j + 1] = " " + "B" + (5);
//                    sala[i][j + 2] = " " + "C" + (5);
//                    sala[i][j + 3] = " " + "D" + (5);
//                    sala[i][j + 4] = " " + "E" + (5);
//                    sala[i][j + 5] = " " + "F" + (5);
//                } else if (i == 4) {
//                    sala[i][j] = " " + "A" + (4);
//                    sala[i][j + 1] = " " + "B" + (4);
//                    sala[i][j + 2] = " " + "C" + (4);
//                    sala[i][j + 3] = " " + "D" + (4);
//                    sala[i][j + 4] = " " + "E" + (4);
//                    sala[i][j + 5] = " " + "F" + (4);
//                } else if (i == 5) {
//                    sala[i][j] = " " + "A" + (3);
//                    sala[i][j + 1] = " " + "B" + (3);
//                    sala[i][j + 2] = " " + "C" + (3);
//                    sala[i][j + 3] = " " + "D" + (3);
//                    sala[i][j + 4] = " " + "E" + (3);
//                    sala[i][j + 5] = " " + "F" + (3);
//
//                } else if (i == 6) {
//                    sala[i][j] = " " + "A" + (3);
//                    sala[i][j + 1] = " " + "B" + (3);
//                    sala[i][j + 2] = " " + "C" + (3);
//                    sala[i][j + 3] = " " + "D" + (3);
//                    sala[i][j + 4] = " " + "E" + (3);
//                    sala[i][j + 5] = " " + "F" + (3);
//
//                } else if (i == 7) {
//                    sala[i][j] = " " + "A" + (2);
//                    sala[i][j + 1] = " " + "B" + (2);
//                    sala[i][j + 2] = " " + "C" + (2);
//                    sala[i][j + 3] = " " + "D" + (2);
//                    sala[i][j + 4] = " " + "E" + (2);
//                    sala[i][j + 5] = " " + "F" + (2);
//
//                } else if (i == 8) {
//                    sala[i][j] = " " + "A" + (1);
//                    sala[i][j + 1] = " " + "B" + (1);
//                    sala[i][j + 2] = " " + "C" + (1);
//                    sala[i][j + 3] = " " + "D" + (1);
//                    sala[i][j + 4] = " " + "E" + (1);
//                    sala[i][j + 5] = " " + "F" + (1);
//                }
//            }
//        }
        System.out.println("La sala vacia pero completa");
        System.out.println("---------------------------------------------------------");
        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j]);
            }
            System.out.println("  ");
        }
        System.out.println("---------------------------------------------------------");
        String opc = "";
        int cont = 0;
//        do {
//
//        for (int i = 0; i < 8; i++) {
//
//            for (int j = 0; j < 6; j++) {

                for (ClaseEspectador aux : espectadores) {
//                        if (aux.getEdad() >= peliculaNueva.getEdadMinima()) {
//                            cont++;
                    int s1 = (int) (Math.random() * 7);
                    int s2 = (int) (Math.random() * 5);
//                        }
                    if (sala[s1][s2].substring(0, 1).equals(" ") && aux.getEdad() >= peliculaNueva.getEdadMinima() && aux.getDineroDisponible() >= c1.getPrecioEntrada()) {
                        sala[s1][s2] = " X";
                    }
                }
                 espectadores.remove(0);
//            }
//        }
//            System.out.println("Desea sentar otro espectador?SI/NO");
//            opc = leer.next();
//        } while (cont != 0);
        System.out.println("sala con gente ------------------");
        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j]);
            }
            System.out.println("  ");
        }
    }
}
