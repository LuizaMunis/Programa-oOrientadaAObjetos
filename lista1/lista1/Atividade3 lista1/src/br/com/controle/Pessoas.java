/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author luiza
 */
public class Pessoas {
    
    private int idade;
    private int contador=0, contador50anos=0;
    private double peso, altura, mediaAltura=0,contador40kg=0;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if(idade>50)
        contador50anos++;      
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        if(peso<40.00)
            contador40kg++;
    }
  public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        if(idade>=10 && idade<=20){
        mediaAltura=+altura;
        }
        contador++;
    }
  
    
    public double calculoMedia(){
        
        return this.mediaAltura/this.contador;    
}
    
    public double calculoPeso(){
        return (this.contador40kg / this.contador) * 100;
    
    }

    public int Contador50anos() {
        return this.contador50anos;
    }
    
     public int Contador() {
        return this.contador;
    }
    
}
