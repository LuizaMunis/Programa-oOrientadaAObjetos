
package br.com.controle;

public class Empregado extends Pessoa {
    
   private double salario;
   private int funcao;
 
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }

   public double salario(){
   return this.salario;
   }
   
   public int definir(int funcao){
   return 0;
   }
   
   public void definirSalario(double novoSalario) {
        this.salario = novoSalario;
    }
     
}
