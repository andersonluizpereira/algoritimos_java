package com.algoritmos1.pagina20;

import java.util.Scanner;

public class KilometrosPorHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float velocidade;
		System.out.println("Digite velocidade m/s");
		velocidade = sc.nextFloat();
		System.out.printf("O resultado da velocidade é :%.2f", velocidade * 3.6);
	}

}
