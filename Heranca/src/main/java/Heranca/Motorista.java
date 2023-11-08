package Heranca;

import java.util.Date;

public class Motorista extends Funcionario {
    private float KmRodado;
    
    public Motorista(){
        super();
    }

    public float calcularSalario(){
        return super.getSalario();
    }

    public void setKmRodado(float KmRodado) {
        this.KmRodado = KmRodado;
    }

    String setNome() {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String setSalario() {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
}
