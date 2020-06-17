package MenuMVC;

public class Consolas extends Categorias{
	private String marcaconsola, modeloconsola, nombre, productos;
	private int precio, idcategorias;
	public Consolas(String nombre,String marcaconsola, String modeloconsola, String productos, int idcategorias, int precio) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		this.idcategorias = idcategorias;
		this.marcaconsola = marcaconsola;
		this.modeloconsola = modeloconsola;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
		
	}
	public String getMarcaconsola() {
		return marcaconsola;
	}
	public void setMarcaconsola(String marcaconsola) {
		this.marcaconsola = marcaconsola;
	}
	public String getModeloconsola() {
		return modeloconsola;
	}
	public void setModeloconsola(String modeloconsola) {
		this.modeloconsola = modeloconsola;
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getIdcategorias() {
		return idcategorias;
	}
	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}
	public void MostrarDatosCon () {
		System.out.println("\nNombre: "+nombre);
		System.out.println("\nMarca: " +marcaconsola);
		System.out.println("\nModelo: "+modeloconsola);
		System.out.println("\nDisponible: " +productos);
		System.out.println("\nNumero de producto: " +idcategorias);
		System.out.println("\nPrecio:  $" +precio + " MXN\n");
	}
	
}
