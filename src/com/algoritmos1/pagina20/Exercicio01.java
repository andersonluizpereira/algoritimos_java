package com.algoritmos1.pagina20;

import java.util.Scanner;

//Construa um algoritmo em diagrama de blocos que :
//  Leia a cotação do dólar
//  Leia um valor em dólares
//  Converta esse valor para Real
//  Mostre o resultado

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new  Scanner(System.in);
		float leiaCotacaoDollar ,leiaVallorEmDollar,resultado;
        
		System.out.print("Digite a cotação do dólar  =  ");  
        leiaCotacaoDollar = sc.nextFloat();
        
        System.out.print("Digite um valor em dólares  =  ");  
        leiaVallorEmDollar = sc.nextFloat();
        
        resultado = leiaCotacaoDollar * leiaVallorEmDollar;
        
        System.out.print("Convertendo em reais:" +resultado);
        
	}

}
