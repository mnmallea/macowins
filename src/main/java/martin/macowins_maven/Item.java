package martin.macowins_maven;

public class Item {
	int cantidad;
	Prenda prenda;
	
	public Item(Prenda unaPrenda, int unaCantidad) {
		this.cantidad = unaCantidad;
		this.prenda = unaPrenda;
	}
	
	public double precio() {
		// TODO Auto-generated method stub
		return prenda.precio() * this.cantidad;
	}
}
