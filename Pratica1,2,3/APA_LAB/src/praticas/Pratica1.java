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
public class Pratica1 {
    public static void main(String[] args) {
        int n = 10;
        int vetor[] = new int[n];
        int contador = 0;
        Random gerador = new Random();
        
        for(int i = 0; i < 5; i++){
            vetor[i] = gerador.nextInt();
            contador++;
        }
        
        System.out.println("Contador: " + contador);
        
    }
 
}
