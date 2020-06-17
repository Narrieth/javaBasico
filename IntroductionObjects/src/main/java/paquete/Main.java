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
     * la herencia nos dice que las clases o los objetos pueden tener hijos mas de una ves
     * puede haber varias generaciones de hijos
     * cada clase puede extender de una sola clase a la vez
     * una clase puede tener un solo padre, no puede tener mas
     */
    public static void main(String[] args) {
//        Pelota p = new Pelota(500,500); //una variable 'p' de tipo pelota que es un objeto,crea un objeto,inicializar el objeto, como propias varibles con porpias funciones y caracteristicas
//        float x= p.obtenerRadio();
//        p.atraparPelota();
//        System.out.println("el radio de la pelota es: " +x);
//        Carro c = new Carro();
//        c.estado();
//        c.encender();
//        c.estado();

//        CarroBMW c;
//        c = new CarroBMW();
//        c.apagar();
//        c.encender();
//        c.turno();

        CarroToyota c;
        c = new CarroToyota();
        c.apagar();
        c.encender();
        System.out.println("el modelo es: " + c.modelo());
    }

}
