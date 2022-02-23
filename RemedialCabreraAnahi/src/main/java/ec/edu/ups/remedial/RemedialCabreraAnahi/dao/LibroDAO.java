package ec.edu.ups.remedial.RemedialCabreraAnahi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Libro;



@Stateless
public class LibroDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Libro lib) {
		em.persist(lib);
	}
	
	public void update (Libro lib) {
		em.merge(lib);
	}
	
	public Libro read(Integer id) {
		Libro lib = em.find(Libro.class, id);
		return lib;
	}
	
	public List<Libro> getLibros(){
		String jpql = "Select c from Libro c";
		Query q = em.createQuery(jpql,Libro.class);
		return q.getResultList();
	}

}
