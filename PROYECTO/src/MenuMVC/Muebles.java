package MenuMVC;

public class Muebles extends Categorias{
	private String tipomueble,colormueble,nombre,productos;
	private int idcategorias, precio;
	public Muebles(String nombre,String tipomueble, String colormueble, String productos,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
	    this.colormueble = colormueble;
	    this.tipomueble = tipomueble;
	    this.idcategorias = idcategorias;
	    this.nombre = nombre;
	    this.precio = precio;
	    this.productos = productos;
	}
	public String getTipomueble() {
		return tipomueble;
	}
	public void setTipomueble(String tipomueble) {
		this.tipomueble = tipomueble;
	}
	public String getColormueble() {
		return colormueble;
	}
	public void setColormueble(String colormueble) {
		this.colormueble = colormueble;
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
	public void MostrarDatosmue() {
		System.out.println("\nNombre: "+getNombre());
		System.out.println("\nPara: "+getTipomueble());
		System.out.println("\nColor: "+getColormueble());
		System.out.println("\nEnvio Gratis: "+getProductos());
		System.out.println("\nPrecio: $"+getPrecio() + " MNX\n");
		System.out.println("\nN/S del producto: "+getIdcategorias());
}
	
}
