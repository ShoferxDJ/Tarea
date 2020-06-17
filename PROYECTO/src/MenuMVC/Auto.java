package MenuMVC;

public class Auto extends Categorias {
	private int numpasajeros, precio, idcategorias;
	private String tipoauto, modeloauto, colorauto, productos, nombre;

    
	public Auto(String nombre,String modeloauto, String tipoauto,String colorauto, String productos,int numpasajeros,int precio, int idcategorias) {
		super(nombre,productos,precio,idcategorias);
		// TODO Auto-generated constructor stub
		this.colorauto = colorauto;
		this.idcategorias = idcategorias;
		this.modeloauto = modeloauto;
		this.nombre = nombre;
		this.numpasajeros = numpasajeros;
		this.precio = precio;
		this.productos = productos;
		this.tipoauto = tipoauto;
		
	}


	public int getNumpasajeros() {
		return numpasajeros;
	}


	public void setNumpasajeros(int numpasajeros) {
		this.numpasajeros = numpasajeros;
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


	public String getTipoauto() {
		return tipoauto;
	}


	public void setTipoauto(String tipoauto) {
		this.tipoauto = tipoauto;
	}


	public String getModeloauto() {
		return modeloauto;
	}


	public void setModeloauto(String modeloauto) {
		this.modeloauto = modeloauto;
	}


	public String getColorauto() {
		return colorauto;
	}


	public void setColorauto(String colorauto) {
		this.colorauto = colorauto;
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
	public void MostrarDatosAuto() {
		System.out.println("\nNombre: "+getNombre());
		System.out.println("\nModelo: "+getModeloauto());
		System.out.println("\nTipo de auto: "+getTipoauto());
		System.out.println("\nColor: "+getColorauto());
		System.out.println("\nMarca: "+getProductos());
		System.out.println("\nNumero de pasajeros: "+getNumpasajeros());
		System.out.println("\nPrecio: $"+getPrecio() + " MNX\n");
		System.out.println("\nN/S del producto: "+getIdcategorias());
}
	}
