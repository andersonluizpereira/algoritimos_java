package com.algoritmos1.pagina20;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idade=0,x=0, idadeMaster = 18;
		try {
		System.out.println("Digite a sua idade");
			idade = sc.nextInt();
			if (idade >=18) {
				System.out.println("Você pode tirar a carteira.");				
			} else {
				System.out.println("Você não pode tirar a carteira.");
				x = idadeMaster - idade;
				System.out.printf("Ainda faltam %d.", x);
			}
		} catch (Exception e) {
			System.out.printf("\nOcorreu um erro %s anos.", e.getStackTrace());
		}

	}

}
