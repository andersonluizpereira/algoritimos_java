package com.algoritmos1.pagina20;

import java.util.Scanner;

//Complete o algoritmo em pseudocódigo sabendo que o seu objetivo é:
//  Ler 4 (quatro) números
//  Calcular o quadrado para cada um
//  Somar todos os quadrados
//  Mostrar o resultado da soma
//programa quadrado

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, q1, q2, q3, q4, soma = 0;
		try {
			System.out.print("Entre com o valor do primeiro número ao quadrado:");  
	        n1 = sc.nextFloat();
	        q1 = n1 * n1; 
	        
			System.out.print("Entre com o valor do segundo número ao quadrado:");  
	        n2 = sc.nextFloat();
	        q2 = n2 * n2;
	        
			System.out.print("Entre com o valor do terceiro número ao quadrado:");  
	        n3 = sc.nextFloat();
	        q3 = n3 * n3;
	        
	        System.out.print("Entre com o valor do quarto número ao quadrado:");  
	        n4 = sc.nextFloat();
	        q4 = (float) Math.pow(n4,2);
	        soma = q1 + q2 + q3 + q4;
		} catch (Exception e) {
			System.out.println("Ocorreu um erro :" +e.getMessage());
			System.out.println("Ocorreu um erro :" +e.getStackTrace());
		}  
		 finally {
			// TODO: handle finally clause
			System.out.printf("\nResultado %f", soma);
		}
	}
}
