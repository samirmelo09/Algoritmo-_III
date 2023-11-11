package com.mycompany.intervaloentrenumeros;

import java.util.Scanner;

public class IntervaloEntreNumeros {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitorSacanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        numero = leitorSacanner.nextInt();
        
        if (numero >= 100 && numero <= 200){
            System.out.println("O numero está no intervalo");        
        }else{
            System.out.println("O numero não está no intervalo");
        
        }
    }
}
