package menu.estudiante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		String cedula = "";
		String cedulaABuscar;
		int posicionGuardada = 0;

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setCedula(cedula);

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setCedula(cedula);

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setCedula(cedula);

		Estudiante estudiante4 = new Estudiante();
		estudiante4.setCedula(cedula);

		Estudiante estudiante5 = new Estudiante();
		estudiante5.setCedula(cedula);

		Estudiante fila[] = new Estudiante[5];
		fila[0] = estudiante1;
		fila[1] = estudiante2;
		fila[2] = estudiante3;
		fila[3] = estudiante4;
		fila[4] = estudiante5;
		do {
			System.out.println("****************************************");
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. SAlIR");
			System.out.println("****************************************");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese el numero de cédula del estudiante: ");
				cedula = teclado.next();
				fila[posicionGuardada] = estudiante1;
				posicionGuardada = posicionGuardada++;
			} else if (opcion == 2) {
				System.out.println("Ingrese el numero de cédula del estudiante a buscar: ");
				cedulaABuscar = teclado.next();
				for (int i = 0; i < 5; i++) {
					Estudiante estudiante = fila[i];
					cedula = estudiante.getCedula();
					boolean resultado = cedulaABuscar.equals(cedula);
					if (resultado == true) {
						System.out.println("Contiene al Estudiante: ");
					} else {
						System.out.println("No contiene al Estudiante: ");
					}
				}
			}
		} while (opcion != 3);
	}
}
