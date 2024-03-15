/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

public class ImparPar {
    private int numero;
    private int impar = 0, par = 0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        verificar();
    }

    private void verificar() {
        if (this.numero % 2 == 0) {
            par = this.numero;
            impar = 0; // Zera o número ímpar se for um número par
        } else {
            impar = this.numero;
            par = 0; // Zera o número par se for um número ímpar
        }
    }

    public int getPar() {
        return par;
    }

    public int getImpar() {
        return impar;
    }
}
