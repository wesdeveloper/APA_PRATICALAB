/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import arquivos.GravaArquivo;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class Algoritmo2 {
    static int contador = 0;
    
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        GravaArquivo grava = new GravaArquivo();

        int n = 0;

        Scanner entrada = new Scanner(System.in);
        while (n <= 0) {
            System.out.println("Informe o tamanho do vetor: ");
            n = entrada.nextInt();
            if (n < 5) {
                System.out.println("O vetor precisa de no minimo 2 posições.");
            }
        }
        int vetor[] = new int[n];

        recebeVetor(n, vetor, random);
        encontraMaior(vetor);
        
        //salva o tamanho do vetor e a quantidade operações em arquivo de texto
        String path = "algoritmo2";
        
        grava.escritor(path, n, contador);
    }

    private static int[] recebeVetor(int n, int[] vetor, Random random) {
        for (int i = 0; i < n; i++) {
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        return vetor;
    }

    private static void encontraMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior)
                maior = vetor[i];
            contador++;
        }
        System.out.println("O maior elemento do vetor é: " + maior);
        System.out.println("A quantidade de operações do algoritmo é: " + contador);

    }

}
