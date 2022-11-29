/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioSeguro;

import Entidades.Cliente;
import Entidades.Vehiculo;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Cliente> personas = new LinkedList();
    List<Vehiculo> autitos = new LinkedList();
    Cliente c1;
    Vehiculo v1;
    
    public void persona() {
        String opc = "si";
        do {
            Cliente c1=new Cliente();
            c1.setNombre("Cliente" + (personas.size() + 1));
            c1.setApellido("Chiquito" + (personas.size() + 1));
            c1.setDocumento(((int)Math.random() * 10) +((int)Math.random() * 10)+ ((int)Math.random() * 10)+((int)Math.random() * 10)+(int)(Math.random() * 10));
            c1.setDomicilio("calle siempre viva" + (personas.size() + 1) + (2) + (3));
            c1.setMail("chingatumadrea@gmail.com" + (personas.size() + 1));
            c1.setTelefonoM(Math.random() * 10 + Math.random() * 10 + Math.random() * 10 + Math.random() * 10);
            personas.add(c1);
            System.out.println("Desea ingresar otro cliente?(SI/NO)");
            opc=leer.next();
        } while (opc.equalsIgnoreCase("Si"));
        for (Cliente aux : personas) {
            System.out.println(aux);
        }
        
    }

    public void autos() {
        String opc = "";
        do {
            v1.setAño((int) Math.random() * 2020);
            v1.setChasis((int) Math.random() * 80000);
            v1.setColor("Verde");
            v1.setMarca("Volkswagen");
            v1.setModelo("Golcito");
            System.out.println("Desea ingresar otro vehiculo?(SI/NO)");
        } while (opc.equalsIgnoreCase("Si"));
        
    }
    
}
