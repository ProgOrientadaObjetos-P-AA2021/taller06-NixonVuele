/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.util.Scanner;
import paqueteuno.Hospital;
import paqueteuno.Ciudad;
import paqueteuno.Enfermero;
import paqueteuno.Medico;

/**
 *
 * @author nixon
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Datos del Hospital
        System.out.println("Ingrese el nombre del hospital:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la direccion del hospital del hospital:");
        String direccionHospital = sc.nextLine();
        //datos de la ciudad
        System.out.println("Ingrese el nombre de la ciudad del hospital:");
        String nombreCiudad = sc.nextLine();
        System.out.println("Ingrese la provincia de la ciudad:");
        String provincia = sc.nextLine();
        //Ciudad
        Ciudad ciu1 = new Ciudad(nombreCiudad, provincia);
        ciu1.establecerNombreCiudad(nombreCiudad);
        ciu1.establecerProvincia(provincia);
        //numero de especialistas
        System.out.println("Ingrese el numero de especialidades del hospital:");
        int numEspecialista = sc.nextInt();
        //numero de doctors:
        System.out.println("Ingrese el numero de Doctores que ejercen en "
                + "el hospital:");
        int numDoctores = sc.nextInt();
        sc.nextLine();
        //Conjuntos de Medicos:
        Medico listaMedicos[];
        listaMedicos = new Medico[numDoctores];
        for (int i = 0; i < listaMedicos.length; i++) {
            System.out.println("Ingrese el nombre del Doctor " + (i + 1));
            String nombreDoctor = sc.nextLine();
            System.out.println("Ingrese la especialidad del Doctor " + (i + 1));
            String especialidad = sc.nextLine();
            System.out.println("Ingrese el salario mensual del Doctor "
                    + (i + 1));
            double salarioDoctor = sc.nextDouble();
            sc.nextLine();
            listaMedicos[i] = new Medico(nombreDoctor, especialidad,
                    salarioDoctor);
        }
        //Conjunto de Enfermeros:
        System.out.println("Ingrese el numero de enfermeros del Hospital:");
        int numEnfermeros = sc.nextInt();
        sc.nextLine();
        Enfermero listaEnfermeros[];
        listaEnfermeros = new Enfermero[numEnfermeros];
        for (int i = 0; i < listaEnfermeros.length; i++) {
            System.out.println("Ingrese el nombre del Enfermero " + (i + 1));
            String nombreEnfermero = sc.nextLine();
            System.out.println("Ingrese el tipo del Enfermero " + (i + 1) + " "
                    + "(nombramiento, contrato) ");
            String tipo = sc.nextLine();
            System.out.println("Ingrese el salario mensual del Enfermero "
                    + (i + 1));
            double salarioEnfermero = sc.nextDouble();
            sc.nextLine();
            listaEnfermeros[i] = new Enfermero(nombreEnfermero, tipo,
                    salarioEnfermero);
        }
        System.out.println("");
        //Creacion del objeto de tipo hospital
        Hospital h1 = new Hospital(nombre, direccionHospital, ciu1,
                numEspecialista, listaMedicos, listaEnfermeros);
        //Se calcula el suedo Total de todos los enfermeros y doctores
        System.out.println("================Hospital=====================");
        h1.establecerSueldoTotal();
        System.out.println(h1);
    }
}
