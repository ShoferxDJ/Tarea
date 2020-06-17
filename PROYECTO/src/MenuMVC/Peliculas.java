package MenuMVC;

public class Peliculas extends Categorias{
	private String generopelicula, clasificacion, nombre, productos;
    private int año, precio, idecategorias;
	public Peliculas(String generopelicula, String clasificacion, String nombre, String productos, int año,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		this.año = año;
		this.clasificacion = clasificacion;
		this.generopelicula = generopelicula;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
		this.idecategorias = idcategorias;
	}
	public String getGeneropelicula() {
		return generopelicula;
	}
	public void setGeneropelicula(String generopelicula) {
		this.generopelicula = generopelicula;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getIdecategorias() {
		return idecategorias;
	}
	public void setIdecategorias(int idecategorias) {
		this.idecategorias = idecategorias;
	}
	
	public void MostrarPeliculas () {
		System.out.println("\nGenero: " +generopelicula);
		System.out.println("\nClasificacion: "+clasificacion);
		System.out.println("\nNombre de Pelicula: " +nombre);
		System.out.println("\nProducto: " +productos);
		System.out.println("\nAño de estreno: " +año);
		System.out.println("\nPrecio: $" +precio + " MXN\n");
		System.out.println("Id: "+idecategorias);
	}
	
}
