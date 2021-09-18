package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// el switch hasta antes de la version 1.7
		// solo funcionaba para byte,short,int,char
		String opcion;
		do {
			System.out.println("Escoja opción:");
			System.out.println("1.Realizar Transferencia");
			System.out.println("2.Consultar pagos");
			System.out.println("3.SALIR");
			opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ingrese número de cuenta");
				break;
			case "2":
				System.out.println("No existen pagos");
				break;
			case "3":
				System.out.println("Cerrando el sistema");
				break;

			// El default se va a ejecutar siempre que no se cumpla los case
			default:
				System.out.println("No a elegido ninguna opción valida");
				break;
			}
		} while (!opcion.equals("3"));// Similar a : opcion != 3
		System.out.println("Gracias por preferinos");

	}
}
