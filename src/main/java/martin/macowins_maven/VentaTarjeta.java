package martin.macowins_maven;

import java.util.Date;
import java.util.List;

public class VentaTarjeta extends Venta{
	int cantidadDeCuotas;
	double coeficiente;
	
	public VentaTarjeta(Date unaFecha, List<Item> unosItems,int cantidadDeCuotas,double coeficiente) {
		super(unaFecha,unosItems);
		this.cantidadDeCuotas= cantidadDeCuotas;
		this.coeficiente = coeficiente;
	}
	
	public double ganancia() {
		return super.ganancia() + this.recargo();
	}
	
	public double recargo(){
		return this.cantidadDeCuotas * this.coeficiente + 0.01 * super.ganancia();
	}
}
