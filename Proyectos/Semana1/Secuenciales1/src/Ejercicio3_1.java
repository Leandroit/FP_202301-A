import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3_1 {

    public static void main(String[] args) {

        double altura, largo, ancho, volumen, costoPorMetro, importe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura de la alberca en metros: ");
        altura = sc.nextDouble();
        System.out.println("Ingrese el largo de la alberca en metros: ");
        largo = sc.nextDouble();
        System.out.println("Ingrese el ancho de la alberca en metros: ");
        ancho = sc.nextDouble();
        System.out.println("Ingrese el costo por metro cúbico de la alberca (en soles): ");
        costoPorMetro = sc.nextDouble();
        volumen = altura*largo*ancho;
        importe = volumen*costoPorMetro;
        System.out.printf("El volumen de la alberca es de %.2f metros cúbicos.\n", volumen);
        System.out.printf("El importe a cobrar por el total de metros cúbicos que se consume de agua al llenar la alberca es %.2f soles \n", importe);

    }
}
