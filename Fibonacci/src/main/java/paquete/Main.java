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
        //algoritmos ciclicos

        //serie de numeros impares
//        for (int i = 0; i <= 100; i++) {
//            if ((i % 2) != 0) {
//                System.out.println(i);
//            }
//        }
        //serie de fibonacci 0,1,1,2,3,5,8,11,...
        int x = 1;
        int anterior = 0;
        int temp;

        while (true) {
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;
            
            if (x > 100) {
                break;
            }
        }
    }

}
