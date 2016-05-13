/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author wesley
 */
public class HeapSort implements IOrganizador{

    public void organizaVetor(int[] vetor) {
        heapSort(vetor);
    }

    private void heapSort(int[] vetor) {
        buildMaxHeap(vetor);
        int n = vetor.length;
        
        for(int i = vetor.length - 1; i > 0; i--){
            swap(vetor, i, 0);
            maxHeapify(vetor, 0, --n);
        }
    }

    private void buildMaxHeap(int[] vetor) {
        for(int i = vetor.length / 2 - 1; i >= 0; i--)
            maxHeapify(vetor, i, vetor.length);
    }

    private void maxHeapify(int[] vetor, int pos, int tvetor) {
        int max = 2 * pos + 1, righit = max + 1;
        if (max < tvetor){
            if(righit < tvetor && vetor[max] < vetor[righit]){
                max = righit;
            }
            
            if (vetor[max] > vetor[pos]){
                swap(vetor, max, pos);
                maxHeapify(vetor, max, tvetor);
            }
        }
    }
    
    private void swap(int[] vetor, int j, int aposJ) {
        int aux = vetor[j];
        vetor[j] = vetor[aposJ];
        vetor[aposJ] = aux;
    }
}
