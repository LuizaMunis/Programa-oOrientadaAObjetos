/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Carro {
    
    private double custoFabrica;
    private double imposto, desconto;
    private double distribuidor;
    private String pcd;

    public String getPcd() {
        return pcd;
    }

    public void setPcd(String pcd) {
        this.pcd = pcd;
    }
    
    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }
    
    public double custoFinal(){
      
        
        this.imposto= this.custoFabrica*0.45 ;
        this.distribuidor=this.custoFabrica*0.28;
        
       if("nao".equalsIgnoreCase(pcd)){
       return this.custoFabrica+this.distribuidor+this.imposto;}
        
        if("sim".equalsIgnoreCase(pcd)){
            
            desconto= (this.custoFabrica+this.distribuidor+this.imposto)*0.20;
            return this.custoFabrica+this.distribuidor+this.imposto-desconto;
        
        }
        return 0;  
    }
}
