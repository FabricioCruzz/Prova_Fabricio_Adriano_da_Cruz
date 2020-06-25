package br.edu.univas.main;

import java.util.Scanner;

public class Questao_3 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero % 5 != 0) {		
			numero += 1;
			
			if (numero % 5 != 0) {
				numero += 1;
				if (numero % 5 == 0) {
					System.out.println(numero);}
				else {System.out.println(numero - 2);}
			}

			else {System.out.println(numero);}
		}
		
		else {System.out.println(numero);}
		
		scanner.close();
	}
}
