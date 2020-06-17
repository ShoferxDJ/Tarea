package MenuMVC;

public class Musica extends Categorias{
	private int idcategorias, precio;
	private String generomusica,productos, nombre;
	
	public Musica(String nombre, String productos, String generomusica, int idcategorias, int precio) {
		super(productos, nombre,idcategorias ,precio );
		// TODO Auto-generated constructor stub

		this.generomusica = generomusica;
		this.idcategorias = idcategorias;
		this.nombre = nombre;
		this.precio = precio;
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


	public String getGeneromusica() {
		return generomusica;
	}


	public void setGeneromusica(String generomusica) {
		this.generomusica = generomusica;
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


public void MostarDatosM () {
	System.out.println("\nNumero de Cancion: " +idcategorias);
	System.out.println("\nNombre: " +nombre );
	System.out.println("\nGenero: " +generomusica);
	System.out.println("\nProducto: " +productos);
	System.out.println("\nPrecio: $" +precio + " MXN\n");
	
}
}

