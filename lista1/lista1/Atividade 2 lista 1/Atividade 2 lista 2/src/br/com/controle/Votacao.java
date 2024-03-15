/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author luiza
 */
public class Votacao {
    
    private int matricula;
    private int contadorVotos = 0;
    public int contador1 = 0;
    public int contador2 = 0;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        contadorVotos++;
    }
    
    public int votos40h(){
        
       return this.contador1;
    }
    
     public int votos44h(){
       return this.contador2;
    }
     
     public int contador() {
        return contadorVotos;
    }

    
    
}
