package ec.edu.ups.remedial.RemedialCabreraAnahi.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import ec.edu.ups.remedial.RemedialCabreraAnahi.business.GestionLibrosON;
import ec.edu.ups.remedial.RemedialCabreraAnahi.model.Libro;


@Path("libros")
public class LibroRest {
	@Inject
	private GestionLibrosON libOn;
	
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Respuesta crearAutor(Libro l) {
		//Instrucciones de la funcionalidad
		Respuesta res = new Respuesta();		
		try {
			libOn.guardarLib(l);
			res.setCodigo(1);
			res.setMensaje("Ok, guardado satisfactoriamente");			
			return res;
		}catch(Exception E) {
			res.setCodigo(99);
			res.setMensaje("Error al guardar");
			return res;
		}
		
	}
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Libro> getLibros(){
		List<Libro> libros = libOn.getLibros();
		return libros;
	}

}
