package ticket;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		String Domicilio, nombre, descripcionProd1, descripcionProd2, fecha, razonSocial;
		int cantidProd1, cantidProd2;
		double precioProd1, total, subtotSinIva, precioTotal2, precioTotal1, precioProd2, iva, precioTot;
	
		
		System.out.println("Fecha");
		fecha = scan.nextLine();
		
		System.out.println("Nombre");
		nombre = scan.nextLine();
		
		System.out.println("Domicilio");
		Domicilio = scan.nextLine();
		
		System.out.println("Producto 1");
		descripcionProd1 = scan.nextLine();
		
		System.out.println("Producto 2");
		descripcionProd2 = scan.nextLine();
		
		System.out.println("Cantidad Prod. 1");
		cantidProd1 = scan.nextInt();
		
		System.out.println("Cantidad Prod. 2");
		cantidProd2 = scan.nextInt();
		
		System.out.println("Precio unitario Prod. 1");
		precioProd1 = scan.nextInt();
		
		System.out.println("Precio unitario Prod. 2");
		precioProd2 = scan.nextInt();
		
		precioTotal1 = precioProd1 * cantidProd1;
		precioTotal2 = precioProd2 * cantidProd2;
		subtotSinIva = precioTotal1 + precioTotal2;
		iva = subtotSinIva * 0.21;
		total = subtotSinIva + iva;
		
		
		System.out.println("*************************************************************************************");
		System.out.println("Fecha: " + fecha);
		System.out.println("Nombre: " + nombre);
		System.out.println("Domicilio: " + Domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("\nCant.\t\t|\t\tDescripcion\t|\t\tP. unit\t\t|\tP. total\n"
				+ "----------------------------------------------------------------------------------------------------\n"
				+ cantidProd1 + "\t\t|\t\t" + descripcionProd1 + "\t\t|\t\t" + precioProd1 + "\t\t|\t" + precioTotal1 
				+ "\n----------------------------------------------------------------------------------------------------\n"
				+ cantidProd2 + "\t\t|\t\t" + descripcionProd2 + "\t\t|\t\t" + precioProd2 + "\t\t|\t" + precioTotal2
				+ "\n----------------------------------------------------------------------------------------------------\n"
				+ "IVA = " + iva + "\n"
				+ "Subtotal (sin IVA) = " + subtotSinIva + "\n"
				+ "Total = " + total);
		

		
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		

		
		
		
  

	}

}
