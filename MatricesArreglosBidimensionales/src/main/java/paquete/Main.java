package paquete;

/**
 *
 * @author Narrieth Felipe Peñaranda
 */
public class Main {

    public static void main(String[] args) {
        int x[][];
        x = new int[3][3];   //matris de 3*3 define el tamaño
        x[0][0] = 1;  //accediendo al indice 0,0
        x[0][1] = 2;
        x[0][2] = 3;
        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;
        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;

//        System.out.println("x[0][2]=" + x[0][2]);
        for (int i = 0; i < 3; i++) { //x
            for (int j = 0; j < 3; j++) { //Y
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
            }
        }
    }

}
