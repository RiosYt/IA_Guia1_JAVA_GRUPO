package senati;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float lado1 = 0, lado2 = 0, lado3 = 0;
		
		System.out.print("Ingrese Lado 1 del tri�ngulo: ");
		lado1 = scn.nextInt();
		
		System.out.print("Ingrese Lado 2 del tri�ngulo: ");
		lado2 = scn.nextInt();
		
		System.out.print("Ingrese Lado 3 del tri�ngulo: ");
		lado3 = scn.nextInt();
		
		float perimetro = lado1 + lado2 + lado3;
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("El per�metro del tri�ngulo es: " + perimetro);
	}
}
