/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;

import tipos.Bubble;
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
        Bubble bolha  = new Bubble();
        Insection insection = new Insection();
        Selection selection = new Selection();
        QuickSort quickSort = new QuickSort();
        
        int n = start.getN();
        
        ordena.inicializaVetor(n);
        ordena.imprime();
        
        System.out.println("\n+----------------------------+");
        
        //chama os diferentes metodos de ordenação
//        bolha.organizaVetor(ordena.getVet());
//        insection.organizaVetor(ordena.getVet());
//        selection.organizaVetor(ordena.getVet());
        quickSort.organizaVetor(ordena.getVet());
        
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
