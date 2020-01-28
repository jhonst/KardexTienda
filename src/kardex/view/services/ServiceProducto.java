package kardex.view.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import kardex.view.models.copy.Producto;

@Stateless
public class ServiceProducto {
	
	private List<Producto> productos = new ArrayList<Producto>();
	
	public void create(Producto prod) {
		prod.setId(productos.size() + 1);
		productos.add(prod);
	}
	
	public void update(Producto producto) {
		
		producto.setNombre(producto.getNombre());
		producto.setDescripcion(producto.getDescripcion());
		producto.setCosto(producto.getCosto());
		producto.setStock(producto.getStock());
		
	}
	
	public void vender(int vendidos, Producto producto) {
		
		producto.setStock(String.valueOf(vendidos));
		
	}
	
	public List<Producto> list() {
		return productos;
	}
	
	public void delete(Producto prod) {
		productos.remove(prod);
	}
	
	public Producto obtenerProductoPorId(String productoId) {
		return productos.get(Integer.parseInt(productoId) - 1);	
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
