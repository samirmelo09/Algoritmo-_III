package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {
    private int totalItensVendidos;
    private float comissaoPorItem;
    
    public Vendedor(){
        super();
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }

    String setNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}