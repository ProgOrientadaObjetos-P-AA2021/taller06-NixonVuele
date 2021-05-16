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
public class Medico {

    private String nombreDoctor;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String nom, String esp, double sueld) {
        nombreDoctor = nom;
        especialidad = esp;
        sueldoMensual = sueld;
    }

    public void establecerNombreDoctor(String n) {
        nombreDoctor = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldoMensual(double n) {
        sueldoMensual = n;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
