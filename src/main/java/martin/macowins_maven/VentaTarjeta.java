package martin.macowins_maven;

public class VentaTarjeta extends Venta{
	int cantidadDeCuotas;
	double coeficiente;
	
	public VentaTarjeta(int cantidadDeCuotas,double coeficiente) {
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
