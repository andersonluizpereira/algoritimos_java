package com.algoritmos1.pagina20;

import java.util.Scanner;

public class SomaTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 =0 ,n2 =0 ,n3 =0, resultado;
		
		System.out.println("Entre com o valor de n1");
		n1 = sc.nextInt();
		
		System.out.println("Entre com o valor de n2");
		n2 = sc.nextInt();
		
		System.out.println("Entre com o valor de n3");
		n3 = sc.nextInt();
		resultado = n1 + n2 + n3;
		
		System.out.println(resultado);
	}

}
