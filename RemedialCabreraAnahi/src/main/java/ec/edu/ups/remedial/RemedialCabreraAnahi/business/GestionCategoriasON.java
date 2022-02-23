package ec.edu.ups.remedial.RemedialCabreraAnahi.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.remedial.RemedialCabreraAnahi.dao.CategoriaDAO;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Categoria;

@Stateless
public class GestionCategoriasON {
	@Inject
	private CategoriaDAO daoCategoria;
	
	public void guardarAutor(Categoria cat) {
		Categoria c = daoCategoria.read(cat.getId());
		if (c == null) {
			daoCategoria.insert(cat);
		}else {
			daoCategoria.update(cat);
		}
	}
	
	public List<Categoria> getCategorias(){
		return daoCategoria.getCategorias();
	}
	
	public Categoria getCategoriaId(Integer id) {
		return daoCategoria.read(id);
	}

}
