package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// 1 Contains
		String frase = "Programación de algoritmos módulo II";
		System.out.println("Ingrese un numero:");
		String palabra = teclado.nextLine();

		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra: " + resultado);

		// 2 Equals
		System.out.println("********************************************");
		String cadena1 = "brandon";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales:" + resultado2);

		// 3 y 4 Upper y Lower
		System.out.println("********************************************");
		String nombre = "juanito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayuscula:" + nombreEnMayuscula);

		String nombre2 = "JOSE";
		String nombreEnMinuscula = nombre2.toLowerCase();
		System.out.println("Nombre en minuscula:" + nombreEnMinuscula);
	}

}
