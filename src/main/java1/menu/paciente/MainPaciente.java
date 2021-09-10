package menu.paciente;

import java.util.Scanner;

public class MainPaciente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		String nombre = "";
		String apellido = "";
		int edad = 0;
		String sintoma = "";
		int i;

		Paciente paciente1 = new Paciente();
		paciente1.setNombre(nombre);
		paciente1.setApellido(apellido);
		paciente1.setEdad(edad);
		paciente1.setSintoma(sintoma);

		Paciente paciente2 = new Paciente();
		paciente2.setNombre(nombre);
		paciente2.setApellido(apellido);
		paciente2.setEdad(edad);
		paciente2.setSintoma(sintoma);

		Paciente paciente3 = new Paciente();
		paciente3.setNombre(nombre);
		paciente3.setApellido(apellido);
		paciente3.setEdad(edad);
		paciente3.setSintoma(sintoma);

		Paciente paciente4 = new Paciente();
		paciente4.setNombre(nombre);
		paciente4.setApellido(apellido);
		paciente4.setEdad(edad);
		paciente4.setSintoma(sintoma);

		Paciente paciente5 = new Paciente();
		paciente5.setNombre(nombre);
		paciente5.setApellido(apellido);
		paciente5.setEdad(edad);
		paciente5.setSintoma(sintoma);
		Paciente fila[] = new Paciente[5];
		fila[0] = paciente1;
		fila[1] = paciente2;
		fila[2] = paciente3;
		fila[3] = paciente4;
		fila[4] = paciente5;
		do {
			System.out.println("****************************************");
			System.out.println("1. Registrar Paciente");
			System.out.println("2. Imprimir Reporte");
			System.out.println("3. SALIR");
			System.out.println("****************************************");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese el nombre del paciente: ");
				nombre = teclado.next();
				System.out.println("Ingrese el apellido del paciente: ");
				apellido = teclado.next();
				System.out.println("Ingrese la edad del paciente: ");
				edad = teclado.nextInt();
				System.out.println("Ingrese el síntoma del paciente: ");
				sintoma = teclado.next();
			} else if (opcion == 2) {
				for (i = 0; i < 5; i++) {
					fila[i] = paciente1;
					System.out.println("Paciente:" + paciente1.getNombre() + "Apellido:" + paciente1.getApellido()
							+ "Edad:" + paciente1.getEdad() + "Síntoma:" + paciente1.getSintoma());
				}
			}
		} while (opcion != 3);
	}
}
