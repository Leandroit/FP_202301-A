import java.util.Scanner;

public class Main {

    /*
      Un conocido diario ofrece suscripciones anuales a los clientes.
      Con la finalidad de promover este tipo de venta, el diario ha
      ofrecido a otras empresas de diverso índole, suscripciones a
      los trabajadores de dichas empresas con el aval de las mismas.
      Los precios de las suscripciones son las siguientes:
      -	Suscripción a la revista “Vamos”: 150 nuevos soles Anuales.
      -	Suscripción a la revista “Cosas”: 170 nuevos soles Anuales.
      -	Suscripción a la revista “Automas”: 250 nuevos soles Anuales.
      -	Suscripción a la revista “Construye”: 200 nuevos soles Anuales.

      (1 suscripcion --> tipo_revista --> precio)

      Adicionalmente, dependiendo de la cantidad de suscripciones se
      pueden dar descuentos por volumen:

      -	De 1 a 10 suscripciones, tiene un 0% de descuento.
      -	De 11 a 100 suscripciones, tiene un 15% de descuento.
      -	De 101 a 200 suscripciones, tiene un 21% de descuento.
      -	Más de 200 suscripciones, tiene un 25% de descuento.

      (#suscripciones --> descuento)

      Desarrollar un subprograma (método) que permita determinar el precio de
      cada suscripción.  *** Entrada: tipo_revista   Salida: precio de 1 suscripcion

      El porcentaje de descuento dependiendo de la cantidad de suscripciones
      a adquirir.  *** (Entrada: cantidadSuscripciones Salida: descuento)

      El total que debería pagar la empresa si adquiriera un determinado tipo
       y número de suscripciones.
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipo;
        int n;
        System.out.println("Ingrese tipo de Revista:");
        tipo = sc.next();
        System.out.println("Ingrese Numero de Suscripciones:");
        n = sc.nextInt();
        System.out.println("Precio Final: " + calcularPrecioTotalSuscripçiones(tipo, n));
    }

    static double calcularPrecioUnaSuscripcion(String tipoRevista) {
        double precio = 0;
        if (tipoRevista.equals("Vamos")) {  //en java no se usa == para cadenas
            precio = 150;
        } else if (tipoRevista.equals("Cosas")) {
            precio = 170;
        } else if (tipoRevista.equals("Automas")) {
            precio = 250;
        } else if (tipoRevista.equals("Construye")) {
            precio = 200;
        }
        return precio;
    }

    static double calcularPrecioUnasuscripcion2(String tipoRevista) {
        double precio = 0;
        switch (tipoRevista) {
            case "Vamos":
                precio = 150;
                break;
            case "Cosas":
                precio = 170;
                break;
            case "Automas":
                precio = 250;
                break;
            case "Construye":
                precio = 200;
                break;
        }
        return precio;
    }

    static double calcularPorcentajeDescuento(int cantidadSuscripciones) {
        double porcentaje = 0;
        if (cantidadSuscripciones <= 10 && cantidadSuscripciones >= 1) {
            porcentaje = 0;
        } else if (cantidadSuscripciones >= 11 && cantidadSuscripciones <= 100) {
            porcentaje = 0.15;
        } else if (cantidadSuscripciones >= 101 && cantidadSuscripciones <= 200) {
            porcentaje = 0.21;
        } else if (cantidadSuscripciones > 200){
            porcentaje = 0.25;//ok
        }
        return porcentaje;
    }

    static double calcularPrecioTotalSuscripçiones(String tipoRevista, int cantidadSuscripciones) {
        double total, porcentajeDescuento;
        total = calcularPrecioUnaSuscripcion(tipoRevista) * cantidadSuscripciones;
        porcentajeDescuento = calcularPorcentajeDescuento(cantidadSuscripciones);
        total = total - porcentajeDescuento * total;
        return total;
    }


}