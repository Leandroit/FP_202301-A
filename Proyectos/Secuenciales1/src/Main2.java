import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int a, b,c;//fin de instrucción, variables : cajitas[  ] : Espacios de memoria
        int area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a:");
        a = sc.nextInt(); //leer numero entero del teclado
        System.out.println("Ingrese el valor de b:");
        b = sc.nextInt();
        System.out.println("Ingrese el valor de c:");
        c = sc.nextInt();
        area = b*c  + (a-c)*b/2;
        System.out.println("El area calculada es: " + area);
    }
}
