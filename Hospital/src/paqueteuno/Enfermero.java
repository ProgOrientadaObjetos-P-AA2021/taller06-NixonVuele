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
public class Enfermero {

    private String nombreEnfermero;
    private String tipo;
    private double sueldoMensual;

    public Enfermero(String nom, String tip, double sueld) {
        nombreEnfermero = nom;
        tipo = tip;
        sueldoMensual = sueld;
    }

    public void establecerNombreEnfermero(String n) {
        nombreEnfermero = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldoMensual(double n) {
        sueldoMensual = n;
    }

    public String obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
