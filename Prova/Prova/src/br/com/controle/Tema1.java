/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class Tema1 {
    
    private double altura, media, menor=10, maior=0;
    private int sexo, quantHomens=0, quantMulher;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
        if(sexo==2){ 
            media+=altura;
            quantHomens++;
        }
    }
    
    public double mediaHomens(){
        return this.media/this.quantHomens; 
    }
    
    public double MaiorAltura(){
       if (altura>maior)
       maior= altura;
    
       return maior;
    }
    
        public double MenorAltura(){
       if (altura<menor)
       menor= altura;
    
       return menor;
    }
}
