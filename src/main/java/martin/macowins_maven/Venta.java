package martin.macowins_maven;

import java.util.Date;
import java.util.List;

public class Venta{
	public Date fecha;
	public List<Item> items;
	
	public Venta(Date unaFecha, List<Item> unosItems) {
		this.fecha = unaFecha;
		this.items = unosItems;
	}

	public boolean esDeFecha(Date unaFecha) {
		// TODO Auto-generated method stub
		return fecha.equals(unaFecha);
	}

	public double ganancia() {
		// TODO Auto-generated method stub
		return items.stream().mapToDouble(item -> item.precio()).sum();
	}
}
