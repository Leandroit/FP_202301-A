import java.util.Scanner;

public class Main3 { // Main3 identifica a la clase
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pagoPorHora;
        double nuevoSueldo;
        double sueldo;
        long horas;
        System.out.println("Ingrese pago por hora:");
        pagoPorHora = sc.nextDouble(); // el nombre de la variable se le denomina identificado
        System.out.println("Ingrese horas trabajadas:");
        horas = sc.nextInt();
        sueldo = horas*pagoPorHora;
        nuevoSueldo = sueldo - 0.1*sueldo;
        System.out.println("Nuevo Sueldo:" + nuevoSueldo);
    }
}
