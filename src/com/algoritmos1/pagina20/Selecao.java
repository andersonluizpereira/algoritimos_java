package com.algoritmos1.pagina20;

import java.util.Scanner;

public class Selecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float nota1 = 0,nota2 = 0,nota3 = 0,nota4 = 0, media = 0;
		
		try {
			System.out.println("Escreva o valor da nota n1");
			nota1 = sc.nextFloat();
			
			System.out.println("Escreva o valor da nota n2");
			nota2 = sc.nextFloat();
			
			System.out.println("Escreva o valor da nota n3");
			nota3 = sc.nextFloat();
			
			System.out.println("Escreva o valor da nota n4");
			nota4 = sc.nextFloat();
			
		} catch (Exception e) {
			System.out.printf("Ocorreu um erro %s", e.getMessage());
			// TODO: handle exception
		} finally {
			media = (nota1+nota2+nota3+nota4)/4;
			if (media >= 7)
				System.out.printf("\nAprovado a média é %.2f ", media);
		}

	}

}
