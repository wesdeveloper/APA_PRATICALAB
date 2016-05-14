/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscas;

/**
 *
 * @author wesley
 */
public class Sequencial implements ITBusca {

    @Override
    public void busca(int[] v, int e) {
        int retorno = Busca_Sequencial(v, e);

        if (retorno == -1) {
            System.out.println("Elemento não encontrado no vetor.");
        } else {
            System.out.println("Elemento encontrado na posição: " + retorno + " do vetor.");
        }

    }

    public int Busca_Sequencial(int v[], int e) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == e) {
                return i;
            }
        }
        return -1;//Não encontrou o elemento procurado
    }

}
