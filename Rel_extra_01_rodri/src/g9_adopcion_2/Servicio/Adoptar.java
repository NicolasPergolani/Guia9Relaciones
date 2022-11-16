package g9_adopcion_2.Servicio;

import g9_adopcion_2.Entidades.Perro;
import g9_adopcion_2.Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adoptar {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    List<Persona> l1 = new ArrayList();
    List<Perro> l2 = new ArrayList();

    public void personas() {
        String opc = "";
        do {
            Persona p1 = new Persona();
            System.out.println("ingrese el nombre de la persona");
            p1.setNombre(leer.next());
            System.out.println("ingrese el apellido");
            p1.setApellido(leer.next());
            l1.add(p1);
            System.out.println("desea agregar otra persona si / no ");
            opc = leer.next();

        } while (opc.equalsIgnoreCase("si"));

    }

    public void perros() {
        String opc = "";
        do {
            Perro p1 = new Perro();
            System.out.println("ingrese el nombre del perro");
            p1.setNombre(leer.next());
            System.out.println("ingrese la raza");
            p1.setRaza(leer.next());
            l2.add(p1);
            System.out.println("desea agregar otro perro si / no ");
            opc = leer.next();

        } while (opc.equalsIgnoreCase("si"));

    }

    public void adoptar() {
        List<Perro> pe1 = new ArrayList();
        int cont = 0;
        String opc = "";
        do {
            System.out.println("ingrese  persona para asignar mascota");
            String nombre = leer.next();
            for (Persona aux : l1) {
                if (nombre.equalsIgnoreCase(aux.getNombre())) {
                    System.out.println("ingrese el nombre del perro");
                    String perro1 = leer.next();
                    for (Perro aux1 : l2) {
                        if (perro1.equalsIgnoreCase(aux1.getNombre())) {
                            aux.setPerro(aux1);
                            pe1.add(aux1);
                            

                            cont++;
                        }

                    }
                    if (cont == 0) {
                        System.out.println("no disponible");
                    }
                    cont = 0;
                }

            }
            System.out.println("desea adoptar otro perro");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("si"));
        l2.removeAll(pe1);

    }

    public void mostrar() {
        for (Persona persona : l1) {
            System.out.println(persona);
        }
        for (Perro perro : l2) {
            System.out.println(perro);
        }

    }
}
