package centroEducativo.controladores;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
	public Estudiante cargarEstudiante(Materia materia, Profesor profesor, int valoracionMateria) {
	    EntityManager entityManager = getEntityManager();
	    try {
	        // Consulta para encontrar al estudiante con la materia, profesor y valoración seleccionados
	        String jpql = "SELECT e FROM Estudiante e " +
	                      "JOIN e.valoraciones vm " +
	                      "WHERE vm.materia = :materia " +
	                      "AND vm.profesor = :profesor " +
	                      "AND vm.valoracion = :valoracionMateria";
	        TypedQuery<Estudiante> query = entityManager.createQuery(jpql, Estudiante.class);
	        query.setParameter("materia", materia);
	        query.setParameter("profesor", profesor);
	        query.setParameter("valoracionMateria", valoracionMateria);

	        // Ejecutar la consulta y devolver el primer resultado (o null si no se encuentra ninguno)
	        return query.getResultList().stream().findFirst().orElse(null);
	    } finally {
	        entityManager.close();
	    }
	}


}
