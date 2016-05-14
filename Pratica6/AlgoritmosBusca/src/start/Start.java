/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import buscas.Binaria;
import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class Start {
    private static int n = 10;
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        Binaria sequencial = new Binaria();
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Informe o valor procurado: ");
        int e = entrada.nextInt();
        
        vetor.inicializaVetor(n);
        vetor.imprime();
        sequencial.busca(vetor.getVet(), e);
        
    }
}
