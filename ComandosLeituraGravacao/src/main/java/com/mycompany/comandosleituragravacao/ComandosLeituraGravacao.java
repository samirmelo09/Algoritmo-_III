
package com.mycompany.comandosleituragravacao;

import java.util.Scanner;

public class ComandosLeituraGravacao {

    public static void main(String[] args) {
        
        //Para ler dados = entrada
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        float cotacaDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        //nextLine - ler uma frase inteira
        String nome = leitor.nextLine();
        // next - ler apenas uma palava
        String codigoRua = leitor.next();
        
        //Exibir dados = saída de dados
        System.out.println("Texto que será exibido");
        System.out.print("Texto que será exibido");
    }
}
