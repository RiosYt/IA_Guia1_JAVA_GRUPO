package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Monto 1: ");
		float m1 = scn.nextFloat();
		System.out.print("Monto 2: ");
		float m2 = scn.nextFloat();
		System.out.print("Monto 3: ");
		float m3 = scn.nextFloat();
		
		float rpta1 = m1 / 5 + 0.2f * m2;
		float rpta2 = (m3 * 1.6f) / 2;
		float rpta3 = 0.92f * (m1 + m2 + m3);
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Resultado 1: " + df.format(rpta1));
		System.out.println("Resultado 2: " + df.format(rpta2));
		System.out.println("Resultado 3: " + df.format(rpta3));
	}
}
