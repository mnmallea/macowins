package martin.macowins_maven;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Prueba {
	public Prenda unaPrenda;
	public Prenda otraPrenda;
	public Item item1, item2;
	public Venta unaVenta;
	
	@Before
	public void init() {
		unaPrenda = new Prenda(1000,TipoPrenda.CAMISA,new Nueva());
		otraPrenda = new Prenda(500,TipoPrenda.SACO, new Nueva());
		item1 = new Item(unaPrenda,1);
		item2 = new Item(otraPrenda,2);
		unaVenta = new Venta(new Date(),Arrays.asList(item1,item2));
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
	@Test
	public void laVentaDebeSerDe2000Pesos() {
		Assert.assertEquals(2000, unaVenta.ganancia(), 0.5);
	}
}
