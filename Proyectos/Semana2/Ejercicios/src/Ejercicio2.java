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

    private static int sumar(int x, int y){
        int s;
        s = x + y;
        return s;
    }

}
