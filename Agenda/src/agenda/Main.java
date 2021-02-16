/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author abarrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda agenda = new Agenda();
        agenda.agregarContacto("Arnaldo", "3108293114");
        agenda.agregarContacto("Pedro", "111");
        agenda.agregarContacto("Maria", "222");
        agenda.agregarContacto("Mauricio", "333");
        agenda.agregarContacto("Maca", "444");
        agenda.agregarContacto("Juan", "555");
        agenda.agregarContacto("Paula", "666");

        Scanner scn = new Scanner(System.in);
        int opcion = 0;

        menu();
        opcion = scn.nextInt();
        while (opcion != 0) {

            //Ingreso
            if (opcion == 1) {
                System.out.println("Ingrese el nombre:");
                String nombre = scn.next();
                System.out.println("Ingrese el fono:");
                String fono = scn.next();

                agenda.agregarContacto(nombre, fono);
            }

            //Buscar
            if (opcion == 2) {
                System.out.println("Ingrese el nombre a buscar:");
                String nombre = scn.next();

                System.out.println(agenda.buscarContacto(nombre));
            }

            if (opcion == 3) {
                System.out.println(agenda.obtenerListado());
                System.out.println("Ingrese el número del contacto a eliminar:");
                int numero = scn.nextInt();

                String datos = agenda.buscarContacto(numero);
                if (!datos.equals("Contacto no encontrado.")) {
                    System.out.println("Se dispone a eliminar a " + datos);
                    System.out.println("Está Seguro? [1]Si [0]No");

                    int seguro = scn.nextInt();
                    if (seguro == 1) {
                        agenda.eliminarContacto(numero);
                        System.out.println("Contacto eliminado.");
                    }
                } else {
                    System.out.println(datos);
                }
            }

            if (opcion == 4) {
                System.out.println(agenda.obtenerListado());
            }

            menu();
            opcion = scn.nextInt();
        }
    }

    public static void menu() {
        System.out.println("-----------------");
        System.out.println("  A G E N D A");
        System.out.println("-----------------");
        System.out.println("[1] Agregar");
        System.out.println("[2] Buscar");
        System.out.println("[3] Eliminar");
        System.out.println("[4] Mostrar");
        System.out.println("[0] Salir");
    }

}
