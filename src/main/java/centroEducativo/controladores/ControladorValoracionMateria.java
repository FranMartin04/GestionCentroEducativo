package centroEducativo.controladores;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import centroEducativo.entities.Estudiante;
import centroEducativo.entities.Materia;
import centroEducativo.entities.Profesor;
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
	public ValoracionMateria findByEstudianteAndProfesorAndMateria(Profesor profesor, Materia materia, Estudiante estudiante) {
	    EntityManager entityManager = null;
	    ValoracionMateria valoracionMateria = null;

	    try {
	        entityManager = getEntityManager();

	        // Crear y ejecutar la consulta utilizando JPA
	        TypedQuery<ValoracionMateria> query = entityManager.createQuery(
	                "SELECT v FROM ValoracionMateria v WHERE v.profesor = :profesor AND v.materia = :materia AND v.estudiante = :estudiante",
	                ValoracionMateria.class);
	        query.setParameter("profesor", profesor);
	        query.setParameter("materia", materia);
	        query.setParameter("estudiante", estudiante);
	        valoracionMateria = query.getSingleResult();
	    } catch (NoResultException e) {
	        // Manejar el caso en que no se encuentre ninguna valoración
	        System.out.println("No se encontraron valoraciones para el estudiante, profesor y materia dados.");
	    } finally {
	        if (entityManager != null) {
	            entityManager.close();
	        }
	    }

	    return valoracionMateria;
	}
    public ValoracionMateria create(ValoracionMateria valoracionMateria) {
        EntityManager entityManager = null;
        try {
            entityManager = getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(valoracionMateria);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return valoracionMateria;
    }

    public ValoracionMateria edit(ValoracionMateria valoracionMateria) {
        EntityManager entityManager = null;
        try {
            entityManager = getEntityManager();
            entityManager.getTransaction().begin();
            valoracionMateria = entityManager.merge(valoracionMateria);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            ex.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return valoracionMateria;
    }
	
}
