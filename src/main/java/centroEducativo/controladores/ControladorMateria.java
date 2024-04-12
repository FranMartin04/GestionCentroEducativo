package centroEducativo.controladores;

import centroEducativo.entities.Materia;


public class ControladorMateria extends SuperControlador{
	
private static ControladorMateria instance = null;
	
	
	public ControladorMateria() {
		super("materia", Materia.class);
	}
	
	
	/**
	 * Singleton
	 * @return
	 */
	public static ControladorMateria getInstance() {
		if (instance == null) {
			instance = new ControladorMateria();
		}
		return instance;
	}
}
