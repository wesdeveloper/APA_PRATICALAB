/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import buscas.Binaria;
import buscas.SSentinela;
import buscas.Sequencial;
import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class Start {
    private static int n = 100;
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        Scanner entrada = new Scanner(System.in);
        int tbusca = 0;
        
        System.out.println("Busca Sequencial = 1, Busca Sequencial com Sentinela = 2, Busca Binaria = 3 ");
        
        //Escolhe o tipo de busca
        System.out.println("Informe o tipo de busca desejada: ");
        tbusca = entrada.nextInt();
        
        //define o elemento procurado
        System.out.println("Informe o valor procurado: ");
        int e = entrada.nextInt();
        
        //inicializa e imprime o vetor
        vetor.inicializaVetor(n);
        vetor.imprime();
        
        //Seleciona o Tipo de Busca escolhido
        switch(tbusca){
            case 1:
                Sequencial sequencial = new Sequencial();
                sequencial.busca(vetor.getVet(), e);
                break;
            case 2:
                SSentinela sentinela = new SSentinela();
                sentinela.busca(vetor.getVet(), e);
                break;
            case 3:
                Binaria binaria = new Binaria();
                binaria.busca(vetor.getVet(), e);
                break;
            default:
                System.out.println("Tipo Inválido!");
        }
    }
}
