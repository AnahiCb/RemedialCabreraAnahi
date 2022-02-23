package ec.edu.ups.remedial.RemedialCabreraAnahi.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.remedial.RemedialCabreraAnahi.dao.AutorDAO;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Autor;

@Stateless
public class GestionAutoresON {
	@Inject
	private AutorDAO daoAutor;
	
	public void guardarAutor(Autor au) {
		Autor a = daoAutor.read(au.getCedula());
		if (a == null) {
			daoAutor.insert(au);
		}else {
			daoAutor.update(au);
		}
	}
	
	public List<Autor> getAutores(){
		return daoAutor.getAutores();
	}
	
	public Autor getAutorCed(String cedula) {
		return daoAutor.read(cedula);
	}

}
