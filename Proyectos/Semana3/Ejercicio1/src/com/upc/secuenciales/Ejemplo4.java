package com.upc.secuenciales;

public class Ejemplo4 {
    public static void main(String[] args) {
        System.out.println(elijeColor(1));
    }
    static String elijeColor(int opcion){
        String color;
        switch (opcion){
            case 1: color = "Rojo";
            break;
            case 2: color = "Verde";
            break;
            case 3: color = "Amarillo";
            break;
            default:
                color = "Negro";
        }
        return color;
    }
}
