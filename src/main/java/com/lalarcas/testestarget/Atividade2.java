package com.lalarcas.testestarget;
import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		  int num1 = 0;
	        int num2 = 1;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Qual número você quer procurar na sequência de Fibonacci?");
	        int numeroToFind = sc.nextInt();
	        int next = 0;
	        boolean find = false;

	        if (numeroToFind == 0 || numeroToFind == 1) {
	            find = true;
	        } else {
	            while (next < numeroToFind) {
	                next = num1 + num2;
	                num1 = num2;
	                num2 = next;
	                
	                if (next == numeroToFind) {
	                    find = true;
	                    break;
	                }
	            }
	        }

	        if (find) {
	            System.out.println(numeroToFind + " está na sequência de Fibonacci.");
	        } else {
	            System.out.println(numeroToFind + " não está na sequência de Fibonacci.");
	        }

	        sc.close();
	}
}
