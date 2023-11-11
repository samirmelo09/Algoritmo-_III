package com.mycompany.apppositivonegativo;

import java.util.Scanner;
        
public class AppPositivoNegativo {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.print("Digite um número: ");
            int numero = leitorScanner.nextInt();
            
            if (numero == 0){
                System.out.println("O numero é Zero");
            } else{
                if(numero > 0){
                    System.out.println("Este numero é Positivo");
                } else {
                    System.out.println("O numero é Negativo");
                }
            }
            
            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = leitorScanner.next().charAt(0);
    
        }   
        
        
    }
}
