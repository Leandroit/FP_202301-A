import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double m1, m2, r, f;
        final double G = 6.67* Math.pow(10,-11);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese masa 1:");
        m1 = sc.nextDouble();
        System.out.println("Ingrese masa 2:");
        m2 = sc.nextDouble();
        System.out.println("Ingrese distancia:");
        r = sc.nextDouble();
        f = G*(m1*m2)/Math.pow(r,2);
        System.out.println("Fuerza:" + f);
    }
}
