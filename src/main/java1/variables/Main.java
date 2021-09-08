package variables;

public class Main {

	public static void main(String[] args) {

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Jordan");
		System.out.println("variable estatica " + Estudiante.barrio);
		System.out.println("variable estatica " + Estudiante.provincia);
		System.out.println("variable instancia "  + estudiante1.getNombre());
	}

}
