package br.edu.univas.main;

import java.util.Scanner;

public class Questao_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int contadorS = 0;
		int contadorN = 0;
		
		int sul = 0;
		int sudeste = 0;
		int centrooeste = 0;
		int norte = 0;
		int nordeste = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			System.out.println("Voc� acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			int opcao = scanner.nextInt();
			if (opcao == 1) {
				contadorS += 1;}
			else {contadorN += 1;}
			
			System.out.println("Qual regi�o do Brasil voc� mora?");
			int local = scanner.nextInt();
			
			if (local == 1) {
				sul += 1;}
			
			else if (local == 2) {
				sudeste += 1;}
			
			else if (local == 3) {
				centrooeste += 1;}
			
			else if (local == 4) {
				norte += 1;}
			
			else {nordeste += 1;}
		}
		
		System.out.println(contadorS + " pessoas votaram SIM.");
		System.out.println(contadorN + " pessoas votaram N�O.");
		System.out.println(sul + " pessoas da regi�o SUL votaram.");
		System.out.println(sudeste + " pessoas da regi�o SUDESTE votaram.");
		System.out.println(centrooeste + " pessoas da regi�o CENTRO-OESTE votaram.");
		System.out.println(norte + " pessoas da regi�o NORTE votaram.");
		System.out.println(nordeste + " pessoas da regi�o NORDESTE votaram.");
		
		scanner.close();
	}
}
