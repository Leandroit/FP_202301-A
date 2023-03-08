import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pagoPorHora;
        double nuevoSueldo;
        double sueldo;
        int horas;
        System.out.println("Ingrese pago por hora:");
        pagoPorHora = sc.nextDouble();
        System.out.println("Ingrese horas trabajadas:");
        horas = sc.nextInt();
        sueldo = horas*pagoPorHora;
        nuevoSueldo = sueldo - 0.1*sueldo;
        System.out.println("Nuevo Sueldo:" + nuevoSueldo);
    }
}
