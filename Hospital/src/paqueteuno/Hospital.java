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
public class Hospital {

    private String nombreHospital;
    private Ciudad ciudadHospital;
    private int numEspecialidades;
    private Medico[] conjuntoMedicos;
    private Enfermero[] conjuntoEnfermero;
    private double sueldoTotal;
    private String direccionHospital;

    public Hospital(String nom, String direc, Ciudad ciu, int numEspecial,
            Medico[] medic, Enfermero[] enfer) {
        nombreHospital = nom;
        direccionHospital = direc;
        ciudadHospital = ciu;
        numEspecialidades = numEspecial;
        conjuntoMedicos = medic;
        conjuntoEnfermero = enfer;

    }

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerCiudadHospital(Ciudad n) {
        ciudadHospital = n;
    }

    public void establecerNumEspecialidades(int n) {
        numEspecialidades = n;
    }

    public void establecerConjuntoMedicos(Medico[] n) {
        conjuntoMedicos = n;
    }

    public void establecerConjuntoEnfermero(Enfermero[] n) {
        conjuntoEnfermero = n;
    }

    public void establecerSueldoTotal() {
        double suma = 0;
        //Sueldo de todos los medicos con for normal
        for (int i = 0; i < conjuntoMedicos.length; i++) {
            suma = suma + conjuntoMedicos[i].obtenerSueldoMensual();
        }
        //Sueldo de todos los enfermeros con for mejorado:
        for (Enfermero obtenerConjuntoEnfermero : obtenerConjuntoEnfermero()) {
            suma = suma + obtenerConjuntoEnfermero.obtenerSueldoMensual();
        }
        sueldoTotal = suma;
    }

    public void establecerDirecccionHospital(String n) {
        direccionHospital = n;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public Ciudad obtenerCiudadHospital() {
        return ciudadHospital;
    }

    public int obtenerNumEspecialidades() {
        return numEspecialidades;
    }

    public Medico[] obtenerConjuntoMedicos() {
        return conjuntoMedicos;
    }

    public Enfermero[] obtenerConjuntoEnfermero() {
        return conjuntoEnfermero;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerDirecccionHospital() {
        return direccionHospital;
    }

    @Override
    public String toString() {
        //Datos del Hospital
        String cadenaFinal = String.format("%S\nDireccion: %s"
                + "\nCiudad: %s\nProvincia: %s\n"
                + "Numero de Especialidades: %d\nListado Medicos:\n",
                "Hospital: " + nombreHospital.toUpperCase(),
                obtenerDirecccionHospital(),
                obtenerCiudadHospital().obtenerNombreCiudad(),
                obtenerCiudadHospital().obtenerProvincia(),
                obtenerNumEspecialidades());
        //for mejorado con Listado de medicos
        for (Medico obtenerConjuntoMedicos : obtenerConjuntoMedicos()) {
            cadenaFinal = String.format("%s- %s - sueldo: %.2f - "
                    + "%s\n", cadenaFinal,
                    obtenerConjuntoMedicos.obtenerNombreDoctor(),
                    obtenerConjuntoMedicos.obtenerSueldoMensual(),
                    obtenerConjuntoMedicos.obtenerEspecialidad());
        }
        cadenaFinal = String.format("%s\nListado de "
                + "enfermeros(as):\n", cadenaFinal);
        //for normal con listado de enfermeros
        for (int i = 0; i < obtenerConjuntoEnfermero().length; i++) {
            cadenaFinal = String.format("%s- %s - sueldo: %.2f - "
                    + "%s\n", cadenaFinal,
                    obtenerConjuntoEnfermero()[i].obtenerNombreEnfermero(),
                    obtenerConjuntoEnfermero()[i].obtenerSueldoMensual(),
                    obtenerConjuntoEnfermero()[i].obtenerTipo());
        }
        //Sueldo total:
        cadenaFinal = cadenaFinal + String.format("\nTotal de sueldo a pagar "
                + "por: %.2f", obtenerSueldoTotal());
        return cadenaFinal;
    }

}
