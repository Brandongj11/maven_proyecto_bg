package ejercicios.coleccion.list;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		Integer numero1 = 1;
		Integer numero2 = 4;
		Integer numero3 = 8;
		Integer numero4 = 20;

		List<Integer> listaNueva = new ArrayList<Integer>();
		listaNueva.add(numero1);// [0]
		listaNueva.add(numero2);// [1]
		listaNueva.add(numero3);// [2]
		listaNueva.add(numero4);// [3]
	}

}
