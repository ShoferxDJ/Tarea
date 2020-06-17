package MenuMVC;

public class Televisores extends Categorias {
	 private int pantalla, precio, idcategorias;
	    private String marcatv, tipopatanlla, productos, nombre;
	public Televisores(String nombre,String marcatv, String tipopantalla, String productos,int pantalla,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		this.marcatv = marcatv;
        this.pantalla = pantalla;
        this.tipopatanlla = tipopantalla;
        this.idcategorias = idcategorias;
        this.marcatv = marcatv;
        this.nombre = nombre;
        this.productos = productos;
        this.precio = precio;
	}
	public int getPantalla() {
		return pantalla;
	}
	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
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
	public String getMarcatv() {
		return marcatv;
	}
	public void setMarcatv(String marcatv) {
		this.marcatv = marcatv;
	}
	public String getTipopatanlla() {
		return tipopatanlla;
	}
	public void setTipopatanlla(String tipopatanlla) {
		this.tipopatanlla = tipopatanlla;
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
public void MD() {
	System.out.println("\nNombre: "+nombre);
	System.out.println("\nMarca: "+marcatv);
	System.out.println("\nTipo de pantalla: "+tipopatanlla);
	System.out.println("\nDisponible: "+productos);
	System.out.println("\nTamaño de Pantalla: "+pantalla + "'");
	System.out.println("\nPrecio: $"+precio + " MNX\n");
	System.out.println("\nN/S del producto: "+idcategorias);
}
}


