package MenuMVC;

public class Telefonia extends Categorias{
	private String tipotel, marcatel, productos, nombre;
	private int idcategorias, precio;
	private float pantallacel;
	public Telefonia(String nombre,String marcatel, String tipotel, String productos,float pantallacel,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		this.marcatel = marcatel;
        this.tipotel = tipotel;    
        this.idcategorias = idcategorias;
        this.nombre = nombre;
        this.precio = precio;
        this.productos = productos;
        this.pantallacel = pantallacel;
	}
	public String getTipotel() {
		return tipotel;
	}
	public void setTipotel(String tipotel) {
		this.tipotel = tipotel;
	}
	public String getMarcatel() {
		return marcatel;
	}
	public void setMarcatel(String marcatel) {
		this.marcatel = marcatel;
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
	public float getPantallacel() {
		return pantallacel;
	}
	public void setPantallacel(float pantallacel) {
		this.pantallacel = pantallacel;
	}
	public void MostrarDcel() {
		System.out.println("\nNombre: "+nombre);
		System.out.println("\nMarca: "+marcatel);
		System.out.println("\nTipo de telefono: "+tipotel);
		System.out.println("\nDisponible: "+productos);
		System.out.println("\nTamaño de Pantalla: "+pantallacel + "'");
		System.out.println("\nPrecio: $"+precio + " MNX\n");
		System.out.println("\nN/S del producto: "+idcategorias);
}
}
