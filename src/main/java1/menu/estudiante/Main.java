package menu.estudiante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String vector[] = new String[5];
		int opcion = 0;
		do {
			System.out.println("****************************************");
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. SAlIR");
			System.out.println("****************************************");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese el numero de cédula del estudiante 1: ");
				String cedula0 = teclado.next();
				System.out.println("Ingrese el numero de cédula del estudiante 2: ");
				String cedula1 = teclado.next();
				System.out.println("Ingrese el numero de cédula del estudiante 3: ");
				String cedula2 = teclado.next();
				System.out.println("Ingrese el numero de cédula del estudiante 4: ");
				String cedula3 = teclado.next();
				System.out.println("Ingrese el numero de cedula del estudiante 5: ");
				String cedula4 = teclado.next();
				vector[0] = cedula0;
				vector[1] = cedula1;
				vector[2] = cedula2;
				vector[3] = cedula3;
				vector[4] = cedula4;
			} else if (opcion == 2) {
				System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
				String cedula = teclado.next();
				boolean res = vector[0].equals(cedula);
				if (res == true) {
					System.out.println("El estudiante esta en la lista ");
				}
				res = vector[1].equals(cedula);
				if (res == true) {
					System.out.println("El estudiante esta en la lista: ");
				}
				res = vector[2].equals(cedula);
				if (res == true) {
					System.out.println("El estudiante esta en la lista: ");
				}
				res = vector[3].equals(cedula);
				if (res == true) {
					System.out.println("El estudiante esta en la lista: ");
				}
				res = vector[4].equals(cedula);
				if (res == true) {
					System.out.println("El estudiante esta en la lista: ");
				}else{
					System.out.println("El estudiante no esta en la lista: ");
				}

			}
		} while (opcion != 3);
	}

}
