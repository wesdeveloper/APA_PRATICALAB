/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import static algoritmos.Algoritmo3.contador;
import arquivos.GravaArquivo;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wesley
 */
public class Algoritmo4 {
    static int contador = 0;

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        GravaArquivo grava = new GravaArquivo();
        
        int linha = 0, coluna = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas da matriz: ");
        linha = entrada.nextInt();

        System.out.println("Informe a quantidade de colunas da matriz: ");
        coluna = entrada.nextInt();

        //cria as matrizes necessárias
        int matriz1[][] = new int[linha][coluna];
        int matriz2[][] = new int[linha][coluna];
        int matrizResul[][] = new int[linha][coluna];

        //inicia as matrizes
        recebeMatriz(linha, coluna, matriz1, random);
        recebeMatriz(linha, coluna, matriz2, random);
        recebeMatriz(linha, coluna, matrizResul);
        
        //realiza a multiplicação das matrizes
        multiplicaMatriz(linha, coluna, matriz1, matriz2, matrizResul);

        //imprime a soma das matrizes
        System.out.println("Matriz 1");
        imprimeMatriz(matriz1, linha, coluna);

        System.out.println("Matriz 2");
        imprimeMatriz(matriz2, linha, coluna);

        System.out.println("Matriz Resultado da Multiplicação");
        imprimeMatriz(matrizResul, linha, coluna);
        System.out.println("A quantidade de operações são: " + contador);
    
        //salva o tamanho do vetor e a quantidade operações em arquivo de texto
        String path = "algoritmo4";
        
        grava.escritor(path, linha, coluna, contador);
    
    }

    private static int[][] recebeMatriz(int linha, int coluna, int[][] matriz, Random random) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = random.nextInt(5);
            }
        }

        return matriz;
    }

    private static int[][] recebeMatriz(int linha, int coluna, int[][] matrizResul) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizResul[i][j] = 0;
            }
        }
        return matrizResul;
    }

    private static void multiplicaMatriz(int linha, int coluna, int[][] matriz1, int[][] matriz2, int[][] matrizResul) {
        for (int i = 0; i < linha; i++) {
            System.out.println("");
            for (int j = 0; j < coluna; j++) {
                for (int x = 0; x < matrizResul[i].length; x++) {
                    matrizResul[i][j] = matrizResul[i][j] + (matriz1[i][x] * matriz2[x][j]);
                    contador++;
                }
            }
        }
    }

    private static void imprimeMatriz(int[][] matriz, int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}