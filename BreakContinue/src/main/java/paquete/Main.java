/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Narrieth Felipe Peñaranda
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Aun estas en el ciclo");
            if (i == 4) {
                break; //corta el ciclo 
//                continue; //se salta el valor de la condicion, termina el ciclo
//                break; //salirse de un ciclo, se utilizan dentro de condicionales if dentro d eun ciclo for
            }
//            continue;
            System.out.println("El valor de i es: " + i);
        }
        System.out.println("has dejado el cilco for");
    }

}
