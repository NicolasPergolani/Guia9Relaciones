/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Revolver;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioRevolver {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
//    ServicioJugador js = new ServicioJugador();
//    int[] vector=new int[6];

    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosAc((int) (Math.random() * 6));

        r.setPosAg((int) (Math.random() * 6));
        mostrar(r);
//        int var=((int) (Math.random() * 6));
//        for (int i = 0; i < 6; i++) {
//            if (vector[var]==r.getPosAg()) {
//                vector[var]=r.getPosAg();
//            }else{
//                vector[i]=9;
//            }
//           
//        }
//        System.out.println("La posivion del vector es: ");
//        System.out.println(vector[var]);
        return r;
    }

    public void mostrar(Revolver r) {
        System.out.println("----------------------------------");
        System.out.println("Posicion del tambor " + r.getPosAc());
        System.out.println("Posicion de la bala " + r.getPosAg());
    }

    public boolean mojar(Revolver r) {

        return (r.getPosAc() == r.getPosAg());

    }

    public void siguienteChorro(Revolver r) {
        int cont = 0;

        String opc = "";
        if (r.getPosAc()==5) {
            r.setPosAc(0);
//            do {
//                r.setPosAc((int) (Math.random() * 6));
//
//                System.out.println("Desea tirar denuevo?(si/no");
//                opc = leer.next();
//            } while (!opc.equalsIgnoreCase("si"));

        }else{
            r.setPosAc(r.getPosAc()+1);
        }
    }

}
