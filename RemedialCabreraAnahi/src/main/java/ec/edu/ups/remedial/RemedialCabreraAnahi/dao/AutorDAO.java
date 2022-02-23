package ec.edu.ups.remedial.RemedialCabreraAnahi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Autor;

@Stateless
public class AutorDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Autor au) {
		em.persist(au);
	}
	
	public void update (Autor au) {
		em.merge(au);
	}
	
	public Autor read(String cedula) {
		Autor au = em.find(Autor.class, cedula);
		return au;
	}
	
	public List<Autor> getAutores(){
		String jpql = "Select c from Autor c";
		Query q = em.createQuery(jpql,Autor.class);
		return q.getResultList();
	}

}
