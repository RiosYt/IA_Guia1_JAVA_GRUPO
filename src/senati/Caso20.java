package senati;

import java.util.Scanner;

public class Caso20 {
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
		System.out.print("Ingrese el precio de la venta: ");
		float costo = scn.nextFloat();
		
		float incremento = costo + costo*0.42f;
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Incremento......: " + incremento);
	}
}
