package ec.edu.ups.remedial.RemedialCabreraAnahi.model;

import javax.persistence.Column;
import javax.persistence.Id;

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
	@Column(name = "lib_autor")
	private Autor autor;
	@Column(name = "lib_categoria")
	private Categoria cate;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	public Libro(Integer codigo, String nombre, double precio, Integer stock, Autor autor, Categoria cate) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.autor = autor;
		this.cate = cate;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCate() {
		return cate;
	}

	public void setCate(Categoria cate) {
		this.cate = cate;
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
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", autor="
				+ autor + ", categoria=" + cate + "]";
	}
	
}
