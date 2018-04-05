package martin.macowins_maven;

public class Liquidacion implements Estado{
	
	public double precio(double precioBase) {
		return precioBase * 0.5;
	}
}
