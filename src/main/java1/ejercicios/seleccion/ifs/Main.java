package ejercicios.seleccion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Escoja opción:");
			System.out.println("1.Realizar Transferncia");
			System.out.println("2.Consultar pagos");
			System.out.println("3.SALIR");
			opcion = teclado.nextLine();
			
			if (opcion.equals("1")) {
				System.out.println("Ingrese número de cuenta");
			} else if (opcion.equals("2")) {
				System.out.println("No existen pagos");
			}
		} while (!opcion.equals("3"));//Similar a : opcion != 3
		System.out.println("Gracias por preferinos");
	}

}
