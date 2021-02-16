/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author abarrios
 */
public class Contacto {

    private String nombre;
    private String fono;

    public Contacto() {
        this.nombre = "";
        this.fono = "";
    }

    public Contacto(String nombre, String fono) {
        this.nombre = nombre;
        this.fono = fono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", fono=" + fono + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fono
     */
    public String getFono() {
        return fono;
    }

    /**
     * @param fono the fono to set
     */
    public void setFono(String fono) {
        this.fono = fono;
    }

}
