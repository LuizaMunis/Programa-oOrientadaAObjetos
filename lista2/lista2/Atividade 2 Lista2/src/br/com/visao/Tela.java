/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Data;
import java.util.Scanner;

public class Tela{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia,mes,ano;
		System.out.print("Digite o dia: ");
		dia = entrada.nextInt();
		System.out.print("Digite o mês: ");
		mes = entrada.nextInt();
		System.out.print("Digite o ano: ");
		ano = entrada.nextInt();
                System.out.println("Data: " + entrada);



		Data calendario = new Data(dia,mes,ano);
		if(calendario.validarData(dia,mes,ano)){
			System.out.print(calendario.getDia());
		}else{
			System.out.print("False");
		}
	}
}