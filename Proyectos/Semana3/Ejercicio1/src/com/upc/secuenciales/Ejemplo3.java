package com.upc.secuenciales;

public class Ejemplo3 {
    public static void main(String[] args) {
        int numero = -10;
        obtenerTipoNumero(numero);
        System.out.println(obtenerTipoNumeroTexto(numero));
    }
    static void obtenerTipoNumero(int numero){
        if(numero>0){
            System.out.println("Es positivo");
        }else if (numero<0) {
            System.out.println("Es negativo");
        }else {
            System.out.println("Es Cero");
        }
    }
    static String obtenerTipoNumeroTexto(int numero){
        String mensaje;
        if(numero>0){
            mensaje = "Es positivo";
        }else if (numero<0) {
            mensaje = "Es negativo";
        }else {
            mensaje = "Es Cero";
        }
        return mensaje;
    }
}
