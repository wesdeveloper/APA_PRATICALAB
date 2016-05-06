/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;

import java.util.Random;

/**
 *
 * @author wesley
 */
public class Ordena implements IOrdena{
    Random gerador = new Random();
    private int vet[];
    
    /**
     * @return the vet
     */
    public int[] getVet() {
        return vet;
    }

    /**
     * @param vet the vet to set
     */
    public void setVet(int[] vet, int n) {
        this.vet = new int [n];
    }
    
    //inicializa o vetor
    public void inicializaVetor(int n){
        this.setVet(vet,n);
        for(int i = 0; i < this.vet.length; i++)
            this.vet[i] = gerador.nextInt(500);
    }
    
    //imprime o vetor
    public void imprime(){
        for(int i = 0; i < this.vet.length; i++)
            System.out.print(this.vet[i] + " ");
//        System.out.println("\n");
    }
    
}
