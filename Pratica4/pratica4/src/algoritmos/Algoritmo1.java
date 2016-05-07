package algoritmos;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wesley
 */
public class Algoritmo1 {

    public static void main(String[] args) {
        Random random = new Random();

        int n = 0, contador = 0;

        Scanner entrada = new Scanner(System.in);
        while (n < 5) {
            System.out.println("Informe o tamanho do vetor: ");
            n = entrada.nextInt();
            if(n < 5)
                System.out.println("O vetor precisa de no minimo 5 posições.");
        }
        int vetor[] = new int[n];

        receveVetor(n, vetor, random);
        calculaMedia(vetor, contador);

    }

    private static int[] receveVetor(int n, int[] vetor, Random random) {
        for (int i = 0; i < n; i++) {
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i]+" " );
        }
        System.out.println("\n");

        return vetor;
    }

    private static void calculaMedia(int[] vetor, int contador) {
        int media = 0;
        for (int i = 0; i < 5; i++) {
            media += vetor[i];
            contador++;
        }
        media = media / 5;
        System.out.println("A média aritmética das 5 primeiras posições do vetor é: " + media);
        System.out.println("A quantidade de operações do algoritmo é: " + contador);
    }
}
