package martin.macowins_maven;

public class Item {
	int cantidad;
	Prenda prenda;
	
	public double precio() {
		// TODO Auto-generated method stub
		return prenda.precio() * this.cantidad;
	}
}
