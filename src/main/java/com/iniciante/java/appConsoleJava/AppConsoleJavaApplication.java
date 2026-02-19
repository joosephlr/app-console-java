package com.iniciante.java.appConsoleJava;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppConsoleJavaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AppConsoleJavaApplication.class, args);

		/*
		João é um comerciante que vende laranjas, ele precisa fazer uma entrega de algumas caixas,
		cada laranja ele vende por 0,50 centavos, cada caixa tem 50 laranjas.

		Faça um programa que peça a quantidade de caixas para o joão e de o total a receber.
		*/

		var initialMessage = "Seja muito bem vindo João, vamos calcular o total a receber pela venda das laranjas!";
		String border = "=".repeat(initialMessage.length());

		System.out.println(border);
		System.out.println(initialMessage);
		System.out.println(border);

		System.out.print("Digite a quantidade de caixas que você irá vender: ");
		int boxesToSell;
		try (var scanner = new java.util.Scanner(System.in)) {
			boxesToSell = scanner.nextInt();
		}

		var pricePerOrange = 0.50;
		var orangesPerBox = 50;

		var totalOranges = boxesToSell * orangesPerBox;
		var totalValue = totalOranges * pricePerOrange;

		var resultMessage = String.format("João venderá %d laranjas, totalizando R$ %.2f.", totalOranges, totalValue);

		border = "=".repeat(resultMessage.length());

		System.out.println(border);
		System.out.println(resultMessage);
		System.out.println(border);

	}

}
