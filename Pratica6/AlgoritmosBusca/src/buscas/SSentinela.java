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
public class SSentinela implements ITBusca {
    static int compara = 0;
    
    @Override
    public void busca(int[] v, int e) {
        int retorno = Busca_Sequencial(v, e);

        if (retorno == -1) {
            System.out.println("Elemento não encontrado no vetor.");
        } else {
            System.out.println("Elemento encontrado na posição: " + retorno + " do vetor.");
        }
        
        System.out.println("Número de comparações: " + compara);
    }

    public int Busca_Sequencial(int v[], int e) {
        int [] vetor = new int[v.length + 1];
        
        for (int i = 0; i < vetor.length; i++) {
            compara++;
            if (vetor[i] == e) {
                return i;
            }else if(i == vetor.length){
                return -1;
            }
        }
        return -1;//Não encontrou o elemento procurado
    }

}
