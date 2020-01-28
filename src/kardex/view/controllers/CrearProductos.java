package kardex.view.controllers;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.component.behavior.FacesBehavior;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import kardex.view.models.copy.Producto;
import kardex.view.services.ServiceProducto;

@Named
@ViewScoped
public class CrearProductos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServiceProducto servicio;
	
	private Producto producto;
	
	@PostConstruct
	public void init() {
		
		producto = new Producto();
		
	}
	
	public void create() throws IOException {
		servicio.create(producto);
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		context.redirect("index.xhtml");
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
}