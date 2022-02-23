package ec.edu.ups.remedial.RemedialCabreraAnahi.view;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.remedial.RemedialCabreraAnahi.business.GestionAutoresON;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Autor;


@Named
@RequestScoped
public class AutoresBean {
	@Inject
	private GestionAutoresON auON;
	
	private Autor newAutor;
	private List<Autor> autoresGuardados;
	
	
	@PostConstruct
	public void init() {
		newAutor = new Autor();
		autoresGuardados = auON.getAutores();
	}
	
	public void guardar() {
		if (newAutor != null) {
			auON.guardarAutor(newAutor);
			System.out.println("cl " + newAutor);
			newAutor = new Autor();
			this.autoresGuardados = auON.getAutores();
		}
	}

	public Autor getNewAutor() {
		return newAutor;
	}

	public void setNewAutor(Autor newAutor) {
		this.newAutor = newAutor;
	}

	public List<Autor> getAutoresGuardados() {
		return autoresGuardados;
	}

	public void setClientesGuardados(List<Autor> autoresGuardados) {
		this.autoresGuardados = autoresGuardados;
	}

}
