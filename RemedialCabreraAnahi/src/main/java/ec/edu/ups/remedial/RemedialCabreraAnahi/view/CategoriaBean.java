package ec.edu.ups.remedial.RemedialCabreraAnahi.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.remedial.RemedialCabreraAnahi.business.GestionCategoriasON;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Categoria;

@Named
@RequestScoped
public class CategoriaBean {
	@Inject
	private GestionCategoriasON catON;
	
	private Categoria newCategoria;
	private List<Categoria> categoriasGuardados;
	
	
	@PostConstruct
	public void init() {
		newCategoria = new Categoria();
		categoriasGuardados = catON.getCategorias();
	}
	
	public void guardar() {
		if (newCategoria != null) {
			catON.guardarAutor(newCategoria);
			System.out.println("cl " + newCategoria);
			newCategoria = new Categoria();
			this.categoriasGuardados = catON.getCategorias();
		}
	}

	public Categoria getNewCategoria() {
		return newCategoria;
	}

	public void setNewCategoria(Categoria newCategoria) {
		this.newCategoria = newCategoria;
	}

	public List<Categoria> getAutoresGuardados() {
		return categoriasGuardados;
	}

	public void setCategoriasGuardados(List<Categoria> categoriasGuardados) {
		this.categoriasGuardados = categoriasGuardados;
	}

}
