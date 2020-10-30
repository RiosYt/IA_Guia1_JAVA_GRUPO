package senati;

import java.text.DecimalFormat;

public class Caso7 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.0");
		
		float operacion = ((17 * 2) + (float) Math.pow(3, 2) - 6) / 5 - (2 * (4.7f - (1.2f * 2)));
		
		System.out.println("==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Respuesta..: " + df.format(operacion));		
		
	}
}
