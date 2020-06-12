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
        int x[] = new int[3];  //dimesion del arreglo, tamaño
        int y[] = {10, 5, 7};
        String s[];
        Object q[];

//        x[0] = 10;
//        x[1] = 5;
//        x[2] = 7;
//  los arreglos puede ser de cualquier tipo, String, Object
//        utilizar variables para accede al indice del arregloy[i]
        for (int i = 0; i < y.length; i++) {   //.length dimension del arreglo
            System.out.println("Arreglo en indice: " + i + "es igual a: " + y[i]);
        }
    }

}
