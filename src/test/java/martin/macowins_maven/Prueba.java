package martin.macowins_maven;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Prueba {
	public Prenda unaPrenda;
	
	@Before
	public void init() {
		unaPrenda = new Prenda(1000,TipoPrenda.CAMISA,new Nueva());
	}

	@Test
	public void laPrendaNoEsBarata() {
		Assert.assertFalse(unaPrenda.esBarata());
	}
	
	@Test
	public void laPrendaDebeCostar1000() {
		Assert.assertEquals(1000, unaPrenda.precio(),0.05);
	}
	@Test
	public void laPrendaEstaDeLiquidacionYAhoraSaleLaMitad() {
		unaPrenda.setEstado(new Liquidacion());
		Assert.assertEquals(500, unaPrenda.precio(),0.05);
	}
	@Test(expected = DescuentoMayorAPrecioBaseException.class)
	public void seLeAplicaUnDescuentoMasGrandeQueElPrecioBaseYDebeDarError() {
		unaPrenda.setEstado(new Promocion(1500));
		Assert.assertEquals(-500, unaPrenda.precio(),0.05);
	}
}
