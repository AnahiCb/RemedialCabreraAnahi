package ec.edu.ups.remedial.RemedialCabreraAnahi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Libro {
	@Id
	@Column(name = "lib_id")
	private Integer codigo;
	@Column(name = "lib_nombre")
	private String nombre;
	@Column(name = "lib_precio")
	private double precio;
	@Column(name = "lib_stock")
	private Integer stock;
	@OneToOne
	@JoinColumn(name = "cat_id")
	private Categoria cat;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Autor> autores;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Libro(Integer codigo, String nombre, double precio, Integer stock, Categoria cat, List<Autor> autores) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.cat = cat;
		this.autores = autores;
	}
	
	
	public List<Autor> getAutores() {
		return autores;
	}



	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}



	public Categoria getCat() {
		return cat;
	}

	public void setCat(Categoria cat) {
		this.cat = cat;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", cat="
				+ cat + ", autores=" + autores + "]";
	}
	
	
}
