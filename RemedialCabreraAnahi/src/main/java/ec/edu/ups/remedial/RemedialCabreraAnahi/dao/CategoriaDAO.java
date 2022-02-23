package ec.edu.ups.remedial.RemedialCabreraAnahi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Categoria;

@Stateless
public class CategoriaDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert (Categoria cat) {
		em.persist(cat);
	}
	
	public void update (Categoria cat) {
		em.merge(cat);
	}
	
	public Categoria read(Integer id) {
		Categoria cat = em.find(Categoria.class, id);
		return cat;
	}
	
	public List<Categoria> getCategorias(){
		String jpql = "Select c from Categoria c";
		Query q = em.createQuery(jpql,Categoria.class);
		return q.getResultList();
	}

}
