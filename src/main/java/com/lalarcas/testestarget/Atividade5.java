package com.lalarcas.testestarget;

import java.util.Scanner;

public class Atividade5 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a string que vai ser invertida.");
		String string[] = sc.nextLine().split("");
		
		String stringInvertida = "";
		for(int i = string.length -1 ; i >= 0; i-- ) {
			stringInvertida += string[i];
		}
		
		System.out.println("Sua string invertida: "+stringInvertida);
		sc.close();
	}
}
