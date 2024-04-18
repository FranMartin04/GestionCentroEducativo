package centroEducativo.controladores;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

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
	public Materia findByNombre(String nombre) {
	    EntityManager entityManager = null;
	    Materia materia = null;
	    try {
	    	entityManager = getEntityManager();
	        TypedQuery<Materia> query = entityManager.createQuery(
	                "SELECT m FROM Materia m WHERE m.nombre = :nombre", Materia.class);
	        query.setParameter("nombre", nombre);
	        materia = query.getSingleResult();
	    } catch (NoResultException e) {
	        // Manejar el caso en que no se encuentre ninguna materia con ese nombre
	        System.out.println("No se encontró ninguna materia con el nombre: " + nombre);
	    } finally {
	        if (entityManager != null) {
	            entityManager.close();
	        }
	    }
	    return materia;
	}
}
