package MenuMVC;

public class Herramientas extends Categorias {
	private String tipoherra, productos, nombre;
	private int idcategorias, precio;
	public Herramientas(String nombre,String tipoherra, String productos,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		 this.tipoherra = tipoherra;
		 this.idcategorias = idcategorias;
		 this.nombre = nombre;
		 this.precio = precio;
		 this.productos = productos;
	}
	public String getTipoherra() {
		return tipoherra;
	}
	public void setTipoherra(String tipoherra) {
		this.tipoherra = tipoherra;
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
	public void MostrarDatosH() {
		System.out.println("\nNombre: "+getNombre());
		System.out.println("\nPara: "+getTipoherra());
		System.out.println("\nDisponible: "+getProductos());
		System.out.println("\nPrecio: $"+getPrecio() + " MNX\n");
		System.out.println("\nN/S del producto: "+getIdcategorias());
}

}

   