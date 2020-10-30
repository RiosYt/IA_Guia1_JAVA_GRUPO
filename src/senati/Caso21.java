package senati;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Introduzca el valor del gasto realizado: ");
		float precio = scn.nextInt();
		
		float disminucion = precio - precio*0.12f;
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Disminución.......: " + disminucion);
	}
}
