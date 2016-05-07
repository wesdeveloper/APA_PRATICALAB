/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author wesley
 */
public class GravaArquivo {
    //Escreve no arquivo de Texto

    public void escritor(String path, int tvetor, int contador) throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

        String linha = "";

        buffWrite.append("O tamanho do vetor é: " + tvetor + "\n");

        buffWrite.append("Quantidade de operações realizadas: " + contador + "\n");

        buffWrite.close();

    }

    public void escritor(String path, int linha, int coluna, int contador) throws IOException {
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

        buffWrite.append("A matriz é: Matriz[" + linha +"]" +  "[" + coluna + "]\n");

        buffWrite.append("Quantidade de operações realizadas: " + contador + "\n");

        buffWrite.close();
        
    }

}

