package paquete;

/**
 *
 * @author Narrieth Felipe Peñaranda
 */
public class Pelota {  //objeto

    //variables nativas de la clase, global
    float radioNativo;
    float pesoNativo;

    //constructores, constuye el objeto asignando valores por defecto a las variables
    public Pelota() {
        radioNativo = 100;
        radioNativo = 250;
    }

    public Pelota(float radio, float peso) {
        this.radioNativo = radio;
        this.pesoNativo = peso;
    }
    //termina constructores

    //metodos
    //funcion que ejecuta ciertas lineas de codigo para lograr algo
    public float obtenerRadio() { //funciones de retorno, regresan un valor del tipo
        return this.radioNativo;
    }

    public float obtenerPeso() {
        return this.pesoNativo;
    }

    public void patearPelota() {
        System.out.println("Haz pateado la pelota");
    }

    public void atraparPelota() {
        System.out.println("Haz atrapado la pelota");
    }
}
