import java.util.Scanner;

public class Ejercicio3 {

    /*
       Calcular el sueldo neto de un trabajador, sabiendo
       que tiene un sueldo básico y que recibe un bono
       de 50 soles por hijo, adicionalmente se le descuenta
       el 13% por afp.
       - calcularBono(numeroHijos)
       - calcularDescuentoAFP(sueldoBasico)
       - calcularSueldoNeto(numeroHijos, sueldoBasico)
       ** un método puede llamar o invocar a otro método
     */
    public static void main(String[] args) {
        int numeroHijos;
        double sueldoBasico;
        double sueldoNeto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa número de hijos:");
        numeroHijos = sc.nextInt();
        System.out.println("Ingres Sueldo Básico:");
        sueldoBasico = sc.nextDouble();

        sueldoNeto = calcularSueldoNeto(numeroHijos, sueldoBasico);
        System.out.println("Sueldo Neto:" + sueldoNeto);
        System.out.println("Bono:" + calcularBono(numeroHijos));
        System.out.println("AFP:" + calcularDescuentoAFP(sueldoBasico));

    }

    static double calcularBono(int numeroHijos) {
        double bono;
        bono = 50 * numeroHijos;
        return bono;
    }

    static double calcularDescuentoAFP(double sueldoBasico) {
        double afp;
        afp = 0.13 * sueldoBasico;
        return afp;
    }

    static double calcularSueldoNeto(int numeroHijos, double sueldoBasico) {
        double sueldo;
        sueldo = sueldoBasico + calcularBono(numeroHijos) - calcularDescuentoAFP(sueldoBasico);
        return sueldo;
    }
}
