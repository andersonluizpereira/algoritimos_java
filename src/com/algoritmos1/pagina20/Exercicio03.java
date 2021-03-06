package com.algoritmos1.pagina20;

import java.util.Scanner;

//Construa um algoritmo em pseudocódigo para pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que serão fornecidos os seguintes dados:
//  Identificação do vendedor
//  Código da peça
//  Preço unitário da peça
//  Quantidade vendida
//  E depois construa o diagrama de blocos do algoritmo desenvolvido.
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String indentificacao = "Vendedor";
		int codigoPeca = 0;
		float precoUnitario = 0 ;
		float quantidadeVendida = 0;
		float comissao = 0.05F;
		double total = 0;
		
		try {
			System.out.print("Entre com a identificação do Vendedor:");  
			indentificacao = sc.next();
			System.out.print("Entre com o Código da peça:");  
			codigoPeca = sc.nextInt();
			System.out.print("Entre com o Preço unitário da peça:");  
			precoUnitario = sc.nextFloat();
			System.out.print("Entre com a quantidade de peças vendidas:");  
			quantidadeVendida = sc.nextFloat();
			total = precoUnitario * quantidadeVendida;
			comissao = comissao * (precoUnitario * quantidadeVendida);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu um erro :" +e.getMessage());
			System.out.println("Ocorreu um erro :" +e.getStackTrace());
		} finally {
			System.out.printf("\nA identificação do vendedor %s"
					+"\nCódigo da peça: %d"
					+"\nPreço da peça: %.2f"
					+"\nQuantidade de peça(s): %.1f"
					+"\nComissão do vendedor: %.2f"
					+ "\nO valor %.2f", indentificacao,codigoPeca,precoUnitario,quantidadeVendida,comissao,total);
		}
	}
}
