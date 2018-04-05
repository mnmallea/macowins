package martin.macowins_maven;

public class Prenda {
	double precioBase;
	Estado estado;
	TipoPrenda tipo;
	
	public Prenda(double unPrecioBase, TipoPrenda unTipo, Estado unEstado) {
		this.precioBase = unPrecioBase;
		this.tipo = unTipo;
		this.estado = unEstado;
	}
	public void setEstado(Estado unEstado) {
		this.estado = unEstado;
	}
	public double precio() {
		return estado.precio(this.precioBase);
	}
	public boolean esBarata() {
		return this.precio() < 500;
	}
}
