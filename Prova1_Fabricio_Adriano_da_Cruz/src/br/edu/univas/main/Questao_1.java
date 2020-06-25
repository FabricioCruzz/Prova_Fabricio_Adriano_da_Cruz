package br.edu.univas.main;

import java.util.Scanner;

public class Questao_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int negativos = 0;
		
		do {
		
		System.out.println("Digite um número: ");
		numero = scanner.nextInt();
		if (numero < 0) {
		negativos += 1;}
		
		}while(numero != 0);
		
		System.out.println("Quantidade de números negativos digitados foram: " + negativos);
		
		scanner.close();
	}
}
