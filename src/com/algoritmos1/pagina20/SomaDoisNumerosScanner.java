package com.algoritmos1.pagina20;

import java.util.Scanner;
//Elaborar o algoritmo que faça a soma de dois números inteiros quaisquer
//Lendo pelo terminal
public class SomaDoisNumerosScanner {
	public static void main(String[] args) {
		Scanner sc =  new  Scanner(System.in);
		int A ,B ,soma;
            System.out.print("Digite primeiro numero  =  ");  
                A = sc.nextInt();
            System.out.print("Digite segundo numero  =  ");   
                B = sc.nextInt();
		soma =  A+B;
            System.out.print("Soma = " + soma);
	}
}
