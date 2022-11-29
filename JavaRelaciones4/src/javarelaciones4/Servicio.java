/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Persona> nuevaPersona = new ArrayList();
    ArrayList<Perro> nuevoPerro = new ArrayList();

    public void crearPersona() {

        String letra = "";

        do {
            Persona p1 = new Persona();
            System.out.println("ingrese nombre de persona");
            p1.setNombre(leer.next());
            System.out.println("ingrese apellido");
            p1.setApellido(leer.next());
            nuevaPersona.add(p1);
            System.out.println("quiere ingresar otra persona(S/n)");
            letra = leer.next();

        } while (letra.equalsIgnoreCase("s"));

    }

    public void crearPerro() {

        String letra = "";
        do {

            Perro perro1 = new Perro();

            System.out.println("ingrese nombre de perro");
            perro1.setNombre(leer.next());
            System.out.println("ingrese raza de perro");
            perro1.setRaza(leer.next());
            System.out.println("ingrese tamaño de perro");
            perro1.setTamaño(leer.next());
            System.out.println("ingrese edad");
            perro1.setEdad(leer.nextInt());
            nuevoPerro.add(perro1);
            System.out.println("quiere crear mas perros(s/n");
            letra = leer.next();

        } while (letra.equalsIgnoreCase("S"));
    }

    public void adoptarPerro() {

        System.out.println("adoptaremos perros de la calle ");

        ArrayList<Perro> adopcionPerro = new ArrayList();

        String letra = "";

        do {

            System.out.println("ingresar nombre de persona");
            String nombrePersona = leer.next();

            for (Persona aux : nuevaPersona) {

                if (nombrePersona.equalsIgnoreCase(aux.getNombre())) {

                    System.out.println("decime el nombre del perro");

                    String nombrePerro = leer.next();

                    for (Perro perro2 : nuevoPerro) {

                        if (nombrePerro.equalsIgnoreCase(perro2.getNombre())) {

                            aux.setPerrito(perro2);
                            adopcionPerro.add(perro2);
                            nuevoPerro.removeAll(adopcionPerro);

                        } else {
                            System.out.println("perro no disponible");

                        }

                    }

                }
            }

            System.out.println("quiere adoptar otro perro(s/n");
            letra = leer.next();

        } while (letra.equalsIgnoreCase("s"));

    }

    public void mostrarPersonas() {

        for (Persona p : nuevaPersona) {
            System.out.println(p);
        }

        for (Perro p2 : nuevoPerro) {
            System.out.println(p2);
        }

    }
}
