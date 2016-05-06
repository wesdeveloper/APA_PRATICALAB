/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticas;

import java.util.Random;

/**
 *
 * @author wesley
 */
public class Pratica3 {
    public static void main(String[] args) {
        int n = 10;
        int matriz[][] = new int[n][n];
        int contador = 0;
        Random gerador = new Random();
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++){
                matriz[i][j] = gerador.nextInt();
                contador++;
            }
        
        System.out.println("Contador: " + contador);
    }
}
