package paquete;

import paquete.Pelota;
import paquete.Carro;

/**
 *
 * @author Narrieth Felipe Peñaranda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Pelota p = new Pelota(500,500); //una variable 'p' de tipo pelota que es un objeto,crea un objeto,inicializar el objeto, como propias varibles con porpias funciones y caracteristicas
//        float x= p.obtenerRadio();
//        p.atraparPelota();
//        System.out.println("el radio de la pelota es: " +x);
        Carro c = new Carro();
        c.estado();
        c.encender();
        c.estado();
    }

}
