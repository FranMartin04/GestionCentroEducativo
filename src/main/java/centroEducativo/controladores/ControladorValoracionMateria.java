package centroEducativo.controladores;

import centroEducativo.entities.ValoracionMateria;

public class ControladorValoracionMateria extends SuperControlador {

	private static ControladorValoracionMateria instance = null;
	
	public ControladorValoracionMateria() {
		super("valoracionmateria", ValoracionMateria.class);
	}
	public static ControladorValoracionMateria getInstance() {
		if (instance == null) {
			instance = new ControladorValoracionMateria();
		}
		return instance;
	}
	
}
