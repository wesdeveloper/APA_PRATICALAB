/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import ordena.Ordena;

/**
 *
 * @author wesley
 */
public class Bubble implements IOrganizador{

    // organiza o vetor

    public void organizaVetor(int[] vetor) {
        int compara = 0;
        int troca = 0;
        int aux = 0;
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                compara++;
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = aux;
                    troca++;
                }
            }
        }
        System.out.println("Número de comparações: " + compara);
        System.out.println("Número de trocas: " + troca);
    }

}
