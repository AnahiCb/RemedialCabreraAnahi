package ec.edu.ups.remedial.RemedialCabreraAnahi.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import ec.edu.ups.remedial.RemedialCabreraAnahi.business.GestionAutoresON;
import ec.edu.ups.remedial.RemedialCabreraAnahi.business.GestionLibrosON;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Autor;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Libro;

public class LibrosBean {
	@Inject
	private GestionLibrosON libON;
	
	private Libro newLibro;
	private List<Libro> librosGuardados;
	
	
	@PostConstruct
	public void init() {
		newLibro = new Libro();
		librosGuardados = libON.getLibros();
	}
	
	public void guardar() {
		if (newLibro != null) {
			libON.guardarLib(newLibro);
			System.out.println("lib " + newLibro);
			newLibro = new Libro();
			this.librosGuardados = libON.getLibros();
		}
	}

	public Libro getNewLibro() {
		return newLibro;
	}

	public void setNewLibro(Libro newLibro) {
		this.newLibro = newLibro;
	}

	public List<Libro> getLibrosGuardados() {
		return librosGuardados;
	}

	public void setClientesGuardados(List<Autor> autoresGuardados) {
		this.librosGuardados = librosGuardados;
	}

}
