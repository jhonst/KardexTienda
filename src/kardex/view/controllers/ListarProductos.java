package kardex.view.controllers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import kardex.view.models.copy.Producto;
import kardex.view.services.ServiceProducto;

@Named
@ViewScoped
public class ListarProductos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServiceProducto servicio;
	
	private Producto usuarios;
	private List<Producto> lista;
	
	@PostConstruct
	public void init() {
		lista =servicio.getProductos();
	}

	public List<Producto> listaqwer() {
		return servicio.getProductos();
	}

	public List<Producto> getLista() {
		return lista;
	}

	public void setLista(List<Producto> lista) {
		this.lista = lista;
	}
	
	
	
}