package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int hora = 0;
		float tarifa = 0;
		
		System.out.print("Ingrese horas trabajadas: ");
		hora = scn.nextInt();
		System.out.print("Ingrese tarifa por hora: ");
		tarifa = scn.nextFloat();
		
		float sueldo = hora * tarifa;
		float bono = sueldo * 5/100;
		float total = sueldo + bono;
		float dolar = total / (float) 3.24;
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Sueldo.............: " + df.format(sueldo));
		System.out.println("Bono...............: " + df.format(bono));
		System.out.println("Total..............: " + df.format(total));
		System.out.println("Total de dólares...: " + df.format(dolar));
		
	}
}
