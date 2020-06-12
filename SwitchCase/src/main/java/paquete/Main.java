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
        // TODO code application logic here
        //int y char, el x es un indice
        int x = 1;
        char y = 'B';
        switch (y) {
            case 'a': {
                System.out.println("Esta es la opcion 0");
                break;
            }
            case 'b': {
                System.out.println("Esta es la opcion 1");
                break;
            }
            default:{
                System.out.println("esta opcion es la opcion por defecto");
            }
        }
    }

}
