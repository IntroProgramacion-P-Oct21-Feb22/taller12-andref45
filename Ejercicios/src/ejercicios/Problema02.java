/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos3 = new double[4][3];
        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
                datos3[i][j] = obtenerSuma(datos1[i][j], datos2[i][j]);
                System.out.printf("La suma en la posición [%d][%d] es %.2f\n",
                        i,
                        j,
                        datos3[i][j]);
            }
            System.out.println();
        }
    }

    public static double obtenerSuma(double a, double b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
