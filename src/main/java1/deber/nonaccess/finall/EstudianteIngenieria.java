package deber.nonaccess.finall;

public final class EstudianteIngenieria extends Estudiante {

	private String velocidadInternet;
	public final String horarioSalida = "20:00";
	public String ciudadActual = "Guayaquil";

	public EstudianteIngenieria() {
		// No se puede reasignar un valor a un atributo final
		horarioSalida = "18:00";
		ciudadActual = "Quito";
	}
}
