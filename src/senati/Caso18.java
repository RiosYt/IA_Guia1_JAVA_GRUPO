package senati;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int base = 0;
		int altura = 0;
		
		System.out.print("Ingrese base del triángulo: ");
		base = scn.nextInt();
		
		System.out.print("Ingrese altura del triángulo: ");
		altura = scn.nextInt();
		
		float area = (base * altura) / 2;
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Área del triángulo: " + area);
	}
}
