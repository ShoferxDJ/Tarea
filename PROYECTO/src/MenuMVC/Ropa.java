package MenuMVC;

public class Ropa extends Categorias{
	private String talla,generoropa,nombre,productos;
	private int idcategorias, precio;
	public Ropa(String nombre,String generoropa, String productos,String talla,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		 this.talla = talla;
		 this.generoropa = generoropa;
		 this.idcategorias = idcategorias;
		 this.nombre =nombre;
		 this.precio = precio;
		 this.productos = productos;

	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getGeneroropa() {
		return generoropa;
	}
	public void setGeneroropa(String generoropa) {
		this.generoropa = generoropa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
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

	public void MostrarDropa() {
		System.out.println("\nNombre: "+getNombre());
		System.out.println("\nPara: "+getGeneroropa());
		System.out.println("\nTipo de Ropa: "+getProductos());
		System.out.println("\nTalla: "+getTalla());
		System.out.println("\nPrecio: $"+getPrecio() + " MNX");
		System.out.println("\nN/S del producto: "+getIdcategorias());
}
}
