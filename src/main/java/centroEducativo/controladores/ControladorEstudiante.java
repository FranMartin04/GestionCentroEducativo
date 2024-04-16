package centroEducativo.controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.Query;

import centroEducativo.entities.Estudiante;
import centroEducativo.entities.Materia;
import centroEducativo.entities.Profesor;
import centroEducativo.entities.ValoracionMateria;


public class ControladorEstudiante extends SuperControlador{
	
private static ControladorEstudiante instance = null;
	
	
	public ControladorEstudiante() {
		super("estudiante", Estudiante.class);
	}
	
	
	/**
	 * Singleton
	 * @return
	 */
	public static ControladorEstudiante getInstance() {
		if (instance == null) {
			instance = new ControladorEstudiante();
		}
		return instance;
	}
}
