package martin.macowins_maven;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;


public class RegistroDeVentas {
	public List<Venta> ventas;
	
	public double gananciasDelDia(Date unaFecha) {
		return this.ventasDelDia(unaFecha).mapToDouble(unaVenta -> unaVenta.ganancia()).sum();
	}
	public Stream<Venta> ventasDelDia(Date unaFecha) {
		return ventas.stream().filter(venta -> venta.esDeFecha(unaFecha));
	}
}