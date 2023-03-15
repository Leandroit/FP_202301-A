
//Alumno: Alberto Rengifo Montori

/* Enunciado:
    La empresa de agua requiere determinar el pago que debe realizar una persona por el
    total de metros cúbicos que consume de agua al llenar una alberca (ver figura).
    Desarrollar un programa que determine el importe a cobrar.
    A=Altura de la alberca
    L=Largo de la alberca
    N=Ancho de la alberca
    CostoxMetroCubico
     */

//Solución:

import java.util.Scanner;
import java.text.DecimalFormat;

public class Pregunta3 {

    public static void main(String[] args) {

        double altura, largo, ancho, volumen, costoPorMetro, importe;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la altura de la alberca en metros: ");
        altura = sc.nextDouble();

        System.out.println("Ingrese el largo de la alberca en metros: ");
        largo = sc.nextDouble();

        System.out.println("Ingrese el ancho de la alberca en metros: ");
        ancho = sc.nextDouble();

        DecimalFormat formato = new DecimalFormat("#.##");

        volumen = altura*largo*ancho;
        System.out.println("El volumen de la alberca es de " + formato.format(volumen) +" metros cúbicos.");

        System.out.println("Ingrese el costo por metro cúbico de la alberca (en soles): ");
        costoPorMetro = sc.nextDouble();

        importe = volumen*costoPorMetro;

        System.out.println("El importe a cobrar por el total de metros cúbicos que se consume de agua al llenar la alberca es " + formato.format(importe) + " soles.");

    }

}
