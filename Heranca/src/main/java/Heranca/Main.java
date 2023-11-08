package Heranca;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Samir");
        v.setSalario(1000.0f);
        v.setCpf("123.456.789-10");
        v.setDataNascimento(new Date());
        v.calcularSalario();
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salário do vendedor é de " + v.calcularSalario());
        
        Motorista m = new Motorista();
        m.setNome("Osvaldo");
        m.setSalario(2000.0f);
        m.setKmRodado(5);
        
        System.out.println( "O salário do Motorista é de " + m.getSalario());
        
    }
}
