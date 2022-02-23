package ec.edu.ups.remedial.RemedialCabreraAnahi.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.edu.ups.remedial.RemedialCabreraAnahi.dao.AutorDAO;
import ec.edu.ups.remedial.RemedialCabreraAnahi.dao.LibroDAO;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Autor;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Libro;


@Stateless
public class GestionLibrosON {

	@Inject
	private LibroDAO daoLibro;
	@Inject
	private AutorDAO daoAutor;
	
	public void guardarLib(Libro l) {
		Libro lib = daoLibro.read(l.getCodigo());
		if (lib == null) {
			daoLibro.insert(l);
		}else {
			daoLibro.update(l);
		}
	}
	public void guardarAu(Autor au) {
		Autor a = daoAutor.read(au.getCedula());
		if (a == null) {
			daoAutor.insert(au);
		}else {
			daoAutor.update(au);
		}
	}
	public List<Libro> getLibros(){
		return daoLibro.getLibros();
	}
	
	public List<Autor> getAutores(){
		return daoAutor.getAutores();
	}
	
	public Libro getLibroID(Integer id) {
		return daoLibro.read(id);
	}
}
