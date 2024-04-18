package centroEducativo.controladores;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import centroEducativo.entities.Profesor;


public class ControladorProfesor extends SuperControlador{
	
private static ControladorProfesor instance = null;
	
	
	public ControladorProfesor() {
		super("profesor", Profesor.class);
	}
	
	
	/**
	 * Singleton
	 * @return
	 */
	public static ControladorProfesor getInstance() {
		if (instance == null) {
			instance = new ControladorProfesor();
		}
		return instance;
	}
	public Profesor findByNombre(String nombre) {
	    EntityManager entityManager = null;
	    Profesor profesor = null;
	    try {
	        entityManager = getEntityManager();
	        TypedQuery<Profesor> query = entityManager.createQuery(
	                "SELECT p FROM Profesor p WHERE p.nombre = :nombre", Profesor.class);
	        query.setParameter("nombre", nombre);
	        profesor = query.getSingleResult();
	    } catch (NoResultException e) {
	        // Manejar el caso en que no se encuentre ningún profesor con ese nombre
	        System.out.println("No se encontró ningún profesor con el nombre: " + nombre);
	    } finally {
	        if (entityManager != null) {
	            entityManager.close();
	        }
	    }
	    return profesor;
	}

}
