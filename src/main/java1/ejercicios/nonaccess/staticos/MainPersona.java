package ejercicios.nonaccess.staticos;

public class MainPersona {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		paciente1.setNombre("Juanito");
		paciente1.setEdad(25);

		paciente1.registrar(paciente1.getNombre());
		paciente1.consultarNacionalidadStatica();
	}

}
