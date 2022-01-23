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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        resultado = factorial(datos);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("El factorial de %.0f es %.2f\t", datos[i][j],
                        resultado[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] factorial(double[][] numero) {
        double fact[][] = new double[4][2];
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                fact[i][j] = facto(numero[i][j]);
            }
        }
        return fact;
    }

    public static double facto(double numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * facto(numero - 1);
        }
    }
}
