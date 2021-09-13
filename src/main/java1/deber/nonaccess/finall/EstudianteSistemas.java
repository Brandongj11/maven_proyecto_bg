package deber.nonaccess.finall;

public class EstudianteSistemas extends EstudianteComputacion {

	// No se puede sobreescribir un metodo final del padre
	@Override
	protected void realizarSistema() {
		System.out.println("Realiza 8 horas de un Sistema de datos");
	}

	protected void realizarMantenimento() {
		System.out.println("Realizar 8 horas de Mantenimento de diferentes tipos de computadoras");
	}
}
