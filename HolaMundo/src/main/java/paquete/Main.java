package paquete;

/**
 *
 * @author Narrieth Felipe Peñaranda
 */
public class Main {

    /**
     * short - numeros cortos 
     * int - numeros enteros 
     * long - numeros enteros largos 
     * float - numeros flotantes 
     * double - numeros dobles 
     * byte - se maneja en bytes 
     * char - caracteres 
     * boolean - boleanos, verdaderos o falsos 
     * String - cadenas de texto 
     * + - * / 
     * % -para ver el residuo de la division
     * operandos logicos:
     * >, >=, <, <=, ==, ||, &&, !
     */
    public static void main(String[] args) {
//        System.out.println("Hola Mundo");
//        double variable1;
//        variable1= 5;
//        double resultado = variable1 / 2;
//        short suma;
//        suma = 3+10;
//        int resta = 8-17;
//        long residuo = 9/2;
//        float multiplicacion = 2*(15*(-2));
//        double division = 10/3.4;
//        
//        System.out.println("El resultado es: "+resultado);
//        System.out.println("El resultado de la suma es: " + suma);
//        System.out.println("El resultaod de la resta es: " + resta);
//        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
//        System.out.println("El resultado de la division es: " + division);
//        System.out.println("El residuo de la division es: " + residuo);
        int var = 6;
        int var2= 10;
        boolean cond;
        cond = true;
        
//        if (var >= 10) {
        if(!((var ==6) || (var2 > 5))){
            cond = true;
        } else {
            cond=false;
        }
        
        if(cond){
            System.out.println("Tu operacion es verdadera");
        }else{
            System.out.println("TU operacion es falsa");
        }

    }
}
