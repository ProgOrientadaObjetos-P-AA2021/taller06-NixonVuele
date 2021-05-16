/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author nixon
 */
public class Ciudad {

    private String nombreCiudad;
    private String provincia;

    public Ciudad(String nombre, String provin) {
        nombreCiudad = nombre;
        provincia = provin;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvincia() {
        return provincia;
    }
}
