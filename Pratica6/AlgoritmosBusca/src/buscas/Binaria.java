/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscas;

import java.util.Arrays;

/**
 *
 * @author wesley
 */
public class Binaria implements ITBusca {

    private static int retorno = 0;

    @Override
    public void busca(int[] v, int e) {
        Arrays.sort(v);
        retorno = Busca_Binaria(v, e);

        if (retorno == -1) {
            System.out.println("Elemento não encontrado no vetor.");
        } else {
            System.out.println("Elemento encontrado na posição: " + retorno + " do vetor.");
        }

    }

    public static int Busca_Binaria(int v[], int e) {
        int inicio = 0, fim = v.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (v[meio] == e) {
                return meio;
            }
            if (e > v[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

}
