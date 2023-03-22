import java.util.Scanner;

public class Ejercicio1 {
    static final double G = 6.67* Math.pow(10,-11);//declaración global a la clase
    public static void main(String[] args) {
        double m1, m2, r, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese masa 1:");
        m1 = sc.nextDouble();
        System.out.println("Ingrese masa 2:");
        m2 = sc.nextDouble();
        System.out.println("Ingrese distancia:");
        r = sc.nextDouble();
        f = calcularFuerzaGravitacional(m1, m2,r);
        System.out.println("Fuerza:" + f);
    }

    static double calcularFuerzaGravitacional(double m1, double m2, double r){
        double f;//auxiliares
        f = G*(m1*m2)/Math.pow(r,2);
        return f;//double
    }
    static void enviarCorreo(double edad){


    }

}
