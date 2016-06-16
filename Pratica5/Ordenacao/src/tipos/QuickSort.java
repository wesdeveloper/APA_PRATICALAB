/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author 31411009
 */
public class QuickSort implements IOrganizador {
    static int compara = 0;
    static int troca = 0;

    public void organizaVetor(int[] vetor) {
            organizaVetor(vetor, 0, vetor.length - 1);
            System.out.println("Número de comparações: " + compara);
            System.out.println("Número de trocas: " + troca);
    }

    private void organizaVetor(int[] vetor, int inicio, int fim) {
        if(inicio < fim){
            int posicaoPivo = separar(vetor, inicio, fim);
            organizaVetor(vetor, inicio, posicaoPivo - 1);
            organizaVetor(vetor, posicaoPivo + 1, fim);
        }
    }
    
    private static int separar(int[] vetor, int inicio, int fim){
        int pivo = vetor[inicio];
        int i = inicio +1, f = fim;
        while(i <= f){
            compara++;
            if(vetor[i] <= pivo)
                i++;
            else if(pivo < vetor[f])
                f--;
            else{
                troca++;
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
    }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
