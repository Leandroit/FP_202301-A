import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radio, area;
        final double PI = 3.1416;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        radio = sc.nextDouble();
        area = Math.PI*Math.pow(radio, 2);// area = PI*radio*radio;
        System.out.printf("El area del circulo es: %.2f", area);
    }
}