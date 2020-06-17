package MenuMVC;

public class Instrumentos extends Categorias {
	private String tipoinstru, marcainstru,productos,nombre;
	private int idcategorias,precio;
	public Instrumentos(String nombre,String tipoinstru, String marcainstru, String productos,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		 this.marcainstru = marcainstru;
		    this.tipoinstru = tipoinstru;
		    this.idcategorias = idcategorias;
		    this.precio = precio;
		    this.productos = productos;
		    this.nombre = nombre;

	}
	public String getTipoinstru() {
		return tipoinstru;
	}
	public void setTipoinstru(String tipoinstru) {
		this.tipoinstru = tipoinstru;
	}
	public String getMarcainstru() {
		return marcainstru;
	}
	public void setMarcainstru(String marcainstru) {
		this.marcainstru = marcainstru;
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
	public void MostrarDatosintru() {
		System.out.println("\nNombre: "+getNombre());
		System.out.println("\nTipo de instrumento: "+getTipoinstru());
		System.out.println("\nMarca: "+getMarcainstru());
		System.out.println("\nDisponible: "+getProductos());
		System.out.println("\nPrecio: $"+getPrecio() + " MNX\n");
		System.out.println("\nN/S del producto: "+getIdcategorias());
}
}



   