package senati;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		
		System.out.print("Ingrese Primer número: ");
		num1 = scn.nextFloat();
		
		System.out.print("Ingrese Segundo número: ");
		num2 = scn.nextFloat();
		
		float promedio = (num1 + num2) / 2;
		float aumento = num1 + num1 * 0.2f;
		float disminucion = num2 - num2 * 0.3f;
		
		System.out.println("\n===================");
		System.out.println("R E S U L T A D O S");
		System.out.println("===================");
		System.out.println("Promedio......: " + promedio);
		System.out.println("Aumento.......: " + aumento);
		System.out.println("Disminución...: " + disminucion);
	}
}
