package paquete;

/**
 *
 * @author Narrieth Felipe Peñaranda
 */
public class Carro {

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
