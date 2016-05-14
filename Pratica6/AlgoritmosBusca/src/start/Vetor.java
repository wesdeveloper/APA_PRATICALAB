/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.Random;

/**
 *
 * @author wesley
 */
public class Vetor implements IVetor {

    private int vet[];
    private int n;

    @Override
    public void inicializaVetor(int n) {
        this.vet = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = i+3;
        }
    }

    @Override
    public void imprime() {
        for (int posicao : vet) {
            System.out.print(posicao + " ");
        }
        System.out.println("");
    }

    public int[] getVet() {
        return vet;
    }

    public void setVet(int[] vet) {
        this.vet = vet;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
