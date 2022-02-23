package ec.edu.ups.remedial.RemedialCabreraAnahi.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Categoria {
	@Id
	@Column(name="cat_id")
	private Integer id;
	@Column(name="cl_nombre")
	private String nombre;
	public Categoria() {
		// TODO Auto-generated constructor stub
	}
	
	public Categoria(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "\n----//---->Categoria [codigo=" + id + ", nombre=" + nombre + "]";
	}

}
