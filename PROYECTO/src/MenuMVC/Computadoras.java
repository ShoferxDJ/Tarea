package MenuMVC;

public class Computadoras extends Categorias {
	private String tipocompu, marcacompu, modelocompu,nombre,productos;
	private int idcategorias, precio;
	public Computadoras(String nombre,String marcacompu,String modelocompu,String tipocompu,String productos,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		 this.marcacompu = marcacompu;
		    this.modelocompu = modelocompu;
		    this.tipocompu = tipocompu;
		    this.idcategorias = idcategorias;
		    this.nombre = nombre;
		    this.precio = precio;
		    this.productos = productos;
	}
	public String getTipocompu() {
		return tipocompu;
	}
	public void setTipocompu(String tipocompu) {
		this.tipocompu = tipocompu;
	}
	public String getMarcacompu() {
		return marcacompu;
	}
	public void setMarcacompu(String marcacompu) {
		this.marcacompu = marcacompu;
	}
	public String getModelocompu() {
		return modelocompu;
	}
	public void setModelocompu(String modelocompu) {
		this.modelocompu = modelocompu;
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
	public void MostrarDatoscompu() {
		System.out.println("\nNombre: "+getNombre());
		System.out.println("\nMarca: "+getMarcacompu());
		System.out.println("\nModelo: "+getModelocompu());
		System.out.println("\nTipo de Computadora: "+getTipocompu());
		System.out.println("\nDisponible: "+getProductos());
		System.out.println("\nPrecio: $"+getPrecio() + " MNX\n");
		System.out.println("\nN/S del producto: "+getIdcategorias());
}
}

   