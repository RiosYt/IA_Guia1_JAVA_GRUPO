package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Ingrese nombre del alumno: ");
		String nombre = scn.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		int nota1 = scn.nextInt();
		
		System.out.print("Ingrese nota 2: ");
		int nota2 = scn.nextInt();
		
		System.out.print("Ingrese nota 3: ");
		int nota3 = scn.nextInt();
		
		float promedio = nota1 * 0.2f + nota2 * 0.3f + nota3 * 0.5f;
		
		System.out.println("\n  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Alumno.......: " + nombre);
		System.out.println("Promedio.....: " + df.format(promedio));
	}
}
