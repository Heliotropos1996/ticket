package ticket;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		String domicilio;
	    String nombre;
		String descripcionProd1;
		String descripcionProd2;
		String fecha;
		String razonSocial;
		int cantidProd1;
		int cantidProd2;
		double precioProd1;
		double precioProd2;
		double precioTotal1;
		double precioTotal2;
		double subtotSinIva;
		double total;
		
		
		

		
		System.out.println("fecha");
		fecha = scan.nextLine();
		
		System.out.println("nombre");
		nombre = scan.nextLine();
		
		System.out.println("domicilio");
		domicilio = scan.nextLine();
		
		System.out.println("producto");
		descripcionProd1 = scan.nextLine();
		
		System.out.println("producto");
		descripcionProd2 = scan.nextLine();
		
		System.out.println("cantidad");
		cantidProd1 = scan.nextInt();
		
		System.out.println("cantidad");
		cantidProd2 = scan.nextInt();
		
		System.out.println("Precio unitario");
		precioProd1 = scan.nextInt();
		
		System.out.println("Precio unitario");
		precioProd2 = scan.nextInt();
		
		precioTotal1 = precioProd1 * 0.21;
		
		
		
		
		System.out.println("*************************************************************************************");	
		System.out.println("Fecha " + fecha);
		System.out.println("*************************************************************************************");
		System.out.println("Nombre " + nombre);
		System.out.println("Domicilio " + domicilio);
		System.out.println("Cant. | Descripcion | P. unit | P. total\r\n"
				+ "----------------------------------------------------------------------------------------------------\r\n"
				+ cantidProd1                +         "|" + descripcionProd1 + "|" + precioProd1 + precioTotal1
				+ "----------------------------------------------------------------------------------------------------\r\n"
				+ "xx | aaaaaaaaaaaaaaaaaaaaaaaa |xxxx |xxx"
				+ "----------------------------------------------------------------------------------------------------");
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		

		
		
		
  

	}

}
