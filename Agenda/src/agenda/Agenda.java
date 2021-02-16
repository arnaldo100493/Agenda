/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author abarrios
 */
public class Agenda {

    private ArrayList<Contacto> listadoContactos;

    public Agenda() {
        this.listadoContactos = new ArrayList<>();
    }

    public void agregarContacto(String nombre, String fono) {
        Contacto contacto = new Contacto(nombre, fono);
        listadoContactos.add(contacto);
    }

    public void agregarContacto(Contacto contacto) {
        listadoContactos.add(contacto);
    }

    public String obtenerListado() {
        String s = "";
        int idx = 1;
        for (Contacto contacto : listadoContactos) {
            s += "\n (" + idx++ + ")" + contacto.getNombre();
        }
        return s;
    }

    public String buscarContacto(String nombre) {
        String s = "";
        for (Contacto contacto : listadoContactos) {
            //if (contacto.getNombre().equalsIgnoreCase(nombre)) {
            if (contacto.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                s += "\n" + contacto.getNombre() + " [FONO: " + contacto.getFono() + "]";
            }
        }
        return s;
    }

    public String buscarContacto(int numero) {
        numero--;
        if (numero >= this.listadoContactos.size() || numero < 0) {
            return "Contacto no encontrado.";
        }
        Contacto contacto = this.listadoContactos.get(numero);
        return contacto.getNombre();
    }

    public void eliminarContacto(int numero) {
        numero--;
        if (numero >= this.listadoContactos.size() || numero < 0) {
            return;
        }
        this.listadoContactos.remove(numero);
    }

}
