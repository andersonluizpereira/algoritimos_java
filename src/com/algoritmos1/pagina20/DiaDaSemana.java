package com.algoritmos1.pagina20;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dia_da_semana = 0;
		String r = "Dia inválido";
		System.out.println("Entre com o dia da semana com valor de 1-6.");
		dia_da_semana = sc.nextInt();
		switch (dia_da_semana) {
		case 1:
			r= "DOM";
			break;
		case 2:
			r= "SEG";
			break;
		case 3:
			r= "TER";
			break;
		case 4:
			r= "QUA";
			break;
		case 5:
			r= "QUI";
			break;
		case 6:
			r= "SEX";
			break;
		default:
			r = "Dia inválido";
		}
		System.out.printf("O dia escolhido da semana é %s",r);
	}

}
