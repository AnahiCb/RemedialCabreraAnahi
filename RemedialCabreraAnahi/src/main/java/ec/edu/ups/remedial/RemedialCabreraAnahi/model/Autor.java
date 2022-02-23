package ec.edu.ups.remedial.RemedialCabreraAnahi.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Autor {
	@Id
	@Column(name="cl_cedula")
	private String cedula;
	@Column(name="cl_nombre")
	private String nombre;
	@Column(name = "cl_direccion")
	private String direccion;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}
	
	public Autor(String cedula, String nombre, String direccion) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "\n----//---->Autor [cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

}
