package com.algoritmos1.pagina20;

import java.util.Scanner;

public class SelecaoEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a,b, c;
		System.out.println("Entre com o valor de a");
		a = sc.nextFloat();
		
		System.out.println("Entre com o valor de b");
		b = sc.nextFloat();
		
		System.out.println("Entre com o valor de c");
		c = sc.nextFloat();
		
		if (a >b && a >=c) {
			System.out.println("A é maior");
		} else if (b >= a && b>=c){
			System.out.println("B é maior");
		} else {
			System.out.println("C é maior");
		}
	}

}
