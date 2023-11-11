package Classes;

public class Pessoa {
    
    //ATRIBUTOS
    String nome;
    private float peso;
    private float altura;
    private float imc;
        
    //MÉTODOS
    // Comportamento dos atributos dentro do meu Algoritmo
    // Sempre nomear os métodos com verbos no infinitivo
    
   /*método construtor*/public Pessoa(String nome, float peso, float altura){
       this.nome = nome;
       this.peso = peso;
       this.altura = altura;
    }
    
    public float calcularIMC(){
        imc = peso / (altura * altura);
        return imc;    
    }
    
    //Métodos acessores
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }    
    public float getAltura(){
        return altura;
    }
    
}
