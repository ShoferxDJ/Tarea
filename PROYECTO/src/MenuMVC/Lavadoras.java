package MenuMVC;

public class Lavadoras extends Categorias{
	private String categorialavadora, marcalavadora,nombre,productos;
	private int capacidadlavadora,precio,idcategorias;
	public Lavadoras(String nombre,String marcalavadora, String categorialavadora, String productos,int capacidadlavadora,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
	    this.categorialavadora = categorialavadora;
	    this.marcalavadora = marcalavadora;
	    this.capacidadlavadora = capacidadlavadora;
	    this.idcategorias = idcategorias ;
	    this.nombre = nombre;
	    this.precio = precio;
	    this.productos = productos;
	}
	
public String getCategorialavadora() {
		return categorialavadora;
	}

	public void setCategorialavadora(String categorialavadora) {
		this.categorialavadora = categorialavadora;
	}

	public String getMarcalavadora() {
		return marcalavadora;
	}

	public void setMarcalavadora(String marcalavadora) {
		this.marcalavadora = marcalavadora;
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

	public int getCapacidadlavadora() {
		return capacidadlavadora;
	}

	public void setCapacidadlavadora(int capacidadlavadora) {
		this.capacidadlavadora = capacidadlavadora;
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

public void MostrarDatosM() {
	
}
public void MostrarDatoslava() {
	System.out.println("\nNombre: "+getNombre());
	System.out.println("\nMarca: "+getMarcalavadora());
	System.out.println("\nColor: "+getCategorialavadora());
	System.out.println("\nEnvio Gratis: "+getProductos());
	System.out.println("\nCapacidad: "+getCapacidadlavadora() +"KG");
	System.out.println("\nPrecio: $"+getPrecio() + " MNX\n");
	System.out.println("\nN/S del producto: "+getIdcategorias());
}
}

