package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
				
		int rad = 0;
		float pi = 3.1416f;
		
		System.out.print("Radio: ");
		rad = scn.nextInt();
		
		float area = pi * ((float) Math.pow(rad, 2));
		float perimetro = 2 * pi * rad;
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Área del circulo.........: " + df.format(area));
		System.out.println("Perímetro del circulo....: " + df.format(perimetro));
		
	}
}
