package com.upc.secuenciales;

import java.util.Scanner;

public class Ejemplo7 {
    /*
       La academia nacional de idiomas programa todos los meses dos exámenes uno escrito y otro oral.
       Estos exámenes se utilizan para determinar el nivel en el que se encuentran los alumnos con
        el propósito de determinar el nivel y con ello el costo del curso.
        Para ello, los niveles se determinan de acuerdo al siguiente cuadro:
           NIVEL	  Examen escrito	       Examen oral
           Nivel 3	  Mayor a 95 puntos 	    Mayor a 75 puntos
           Nivel 2	  Mayor a 95 puntos	        Menor igual a 75 puntos
           Nivel 1	  Menor igual a 95 puntos	Cualquier puntaje

         Dependiendo del nivel asignado se determina el precio del programa mensual de acuerdo a lo siguiente:
           -	Nivel 1 el precio es de S/.150.00
           -	Nivel 2 el precio es de S/.250.00
           -	Nivel 3 el precio es de S/.400.00
        Desarrollar un subprograma que permita determinar el Nivel del alumno y otro
        subprograma que determine el precio a cobrar.
        */
    static String obtenerNivel(int examenEscrito, int examenOral){
        String nivel=null;
        if(examenEscrito>95 && examenOral>75){
            nivel = "Nivel 3";
        } else if (examenEscrito>95 && examenOral<=75) {
            nivel = "Nivel 2";
        } else if (examenEscrito<=95) {
            nivel = "Nivel 1";
        }
        return nivel;
    }

    static double obtenerPrecio(String nivel){
        double precio=0;
        if(nivel == "Nivel 1"){
            precio = 150;
        } else if (nivel == "Nivel 2") {
            precio = 250;
        } else if (nivel == "Nivel 3") {
            precio = 400;
        }
        return precio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examenEscrito, examenOral;
        System.out.println("Examen Escrito:");
        examenEscrito = sc.nextInt();
        System.out.println("Examen Oral:");
        examenOral = sc.nextInt();
        String nivel;
        nivel = obtenerNivel(examenEscrito,examenOral);
        System.out.println("Precio del Curso:" + obtenerPrecio(nivel));
    }

}
