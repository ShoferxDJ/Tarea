package MenuMVC;

public class Categorias {
	private int idcategorias, precio;
    private String productos, nombre;
   
	public Categorias(String productos, String nombre, int idcategorias, int precio) {
		super();
		this.idcategorias = idcategorias;
		this.precio = precio;
		this.productos = productos;
		this.nombre = nombre;
	}

	public int getIdcategorias() {
		return idcategorias;
	}
	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}