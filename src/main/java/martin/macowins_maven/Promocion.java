package martin.macowins_maven;

public class Promocion implements Estado{
	public double valorFijo;
	
	public Promocion(double valorFijo) {
		this.valorFijo = valorFijo;
	}

	@Override
	public double precio(double precioBase) {
		if(precioBase < this.valorFijo) {
			throw new DescuentoMayorAPrecioBaseException();
		}else {
		return precioBase - this.valorFijo;
		}
	}
	
}
