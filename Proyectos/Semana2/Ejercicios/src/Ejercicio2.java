public class Ejercicio2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int suma ;
        suma = sumar(a,b);
        System.out.println(suma);
        suma = sumar(8, 10);
        System.out.println(suma);

    }

    private static int sumar(int x, int y){ // función, "método" , módulo, procedeimiento, rutina
        int s;
        s = x + y;
        return s;
    }

    private static int calcularOtro(){
        int s;
        s = sumar(3,4);
        s = s + 1;
        return s;
    }

}
