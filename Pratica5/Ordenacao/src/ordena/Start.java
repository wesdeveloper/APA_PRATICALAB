/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;

import java.util.Scanner;
import tipos.Bubble;
import tipos.HeapSort;
import tipos.Insection;
import tipos.QuickSort;
import tipos.Selection;

/**
 *
 * @author wesley
 */
public class Start {

    private int n = 10;

    public static void main(String[] args) {
        Start start = new Start();
        Ordena ordena = new Ordena();

        int tbusca = 0;
        int n = start.getN();
        Scanner entrada = new Scanner(System.in);

        System.out.println("BubbleSort = 1, SelectionSort = 2, InserctionSort = 3, QuickSort = 4, HeapSort = 5");

        //Escolhe o tipo de busca
        System.out.println("Informe o tipo de ordenação desejada: ");
        tbusca = entrada.nextInt();

        ordena.inicializaVetor(n);
        ordena.imprime();

        System.out.println("\n+----------------------------+");

        switch (tbusca) {
            case 1:
                Bubble bolha = new Bubble();
                bolha.organizaVetor(ordena.getVet());
                break;
            case 2:
                Selection selection = new Selection();
                selection.organizaVetor(ordena.getVet());
                break;
            case 3:
                Insection insection = new Insection();
                insection.organizaVetor(ordena.getVet());
                break;
            case 4:
                QuickSort quickSort = new QuickSort();
                quickSort.organizaVetor(ordena.getVet());
                break;
            case 5:
                HeapSort heapSort = new HeapSort();
                heapSort.organizaVetor(ordena.getVet());
                break;
        }
        //imprime novamente o vetor organizado
        ordena.imprime();
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
}
