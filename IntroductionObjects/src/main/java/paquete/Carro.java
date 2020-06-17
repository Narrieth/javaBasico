package paquete;

/**
 *
 * @author Narrieth Felipe Peñaranda
 */
public class Carro { //objeto

    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroPuertas;
    boolean encendido = false;
    String modelo;

    public Carro() {
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 4;
        //los demas que no esten incluidos se colocaran como nulos o no declarados pero no afecta
    }

    public String modelo() {
        return this.modelo;
    }

    public double obtenerPeso() {
        return this.peso;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El carro esta encendido");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El carro esta apagado");
    }

    public void estado() {
        if (this.encendido == true) {
            System.out.println("El carro esta encendido 11");
        } else {
            System.out.println("El carro esta apagado 11");
        }
    }
}

class CarroBMW extends Carro {

    public CarroBMW() {
        this.modelo = "BMW";
    }

    public void turno() {
        System.out.println("Acabas de viajar a 100 millas por hora");
    }
}

class CarroToyota extends Carro {

    public CarroToyota() {
        modelo = "Toyota";
    }

}

//hereda los metodos y propiedades de CarroToyota y de Carro

class Carrito extends CarroToyota{

}
