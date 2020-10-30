package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese el nombre del producto: ");
		String producto = sc.nextLine();
		
		System.out.print("Precio del producto: ");
		float precio = sc.nextFloat();
	
		System.out.print("Cantidad del producto: ");
		int cantidad = sc.nextInt();
		
		float importe = precio * cantidad;
		float igv = 0.18f * importe;
		float dscto = 0.03f * importe;
		float total = importe - dscto + igv;
		
		System.out.println("\n==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Producto...........: " + producto);
		System.out.println("Precio.............: " + precio);
		System.out.println("Cantidad...........: " + cantidad);
		System.out.println("Importe............: " + importe);
		System.out.println("IGV................: " + df.format(igv));
		System.out.println("Descuento..........: " + df.format(dscto));
		System.out.println("Total..............: " + df.format(total));
		
	}
}
