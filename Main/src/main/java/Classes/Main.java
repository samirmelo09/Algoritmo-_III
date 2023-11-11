package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa("Zeca", 80, 1.58f);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Diga seu nome: ");
        objetoPessoa.setNome(leitor.next());

        System.out.println("Diga qual é o seu peso (Kg): ");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.println("Informe a sua altura : ");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("Olá " + objetoPessoa.nome + ", seu IMC é de "
                + objetoPessoa.calcularIMC());

    }
}
