package MenuMVC;

public class Calzado extends Categorias {
	private int numerozapato, idcategorias,precio;
	private String generozapato,nombre,productos, marcazapato;
	public Calzado(String nombre,String generozapato, String marcazapato, String productos,int numerozapato,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		this.numerozapato = numerozapato;
		this.generozapato = generozapato;
		this.idcategorias = idcategorias;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
		this.marcazapato = marcazapato;
	}
	public int getNumerozapato() {
		return numerozapato;
	}
	public void setNumerozapato(int numerozapato) {
		this.numerozapato = numerozapato;
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
	public String getGenerozapato() {
		return generozapato;
	}
	public void setGenerozapato(String generozapato) {
		this.generozapato = generozapato;
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
	public String getMarcazapato() {
		return marcazapato;
	}
	public void setMarcazapato(String marcazapato) {
		this.marcazapato = marcazapato;
	}

	public void MostrarDatoszapatos() {
		System.out.println("\nNombre: "+getNombre());
		System.out.println("\nPara: "+getGenerozapato());
		System.out.println("\nMarca: "+getMarcazapato());
		System.out.println("\nTipo de Zapato: "+getProductos());
		System.out.println("\nNumero: "+getNumerozapato());
		System.out.println("\nPrecio: $"+getPrecio() + " MNX\n");
		System.out.println("\nN/S del producto: "+getIdcategorias());
}
}


