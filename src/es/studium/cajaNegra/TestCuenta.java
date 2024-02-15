package es.studium.cajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCuenta {

	@Test
	void ingresar1 () 
	{
		Cuenta c = new Cuenta();
		c.ingresar(10.0f);
		
		float resultadoReal = c.getSaldo();
		float resultadoEsperado = 10.0f;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void ingresar2 () 
	{
		Cuenta c = new Cuenta();
	//	c.ingresar(Float.MAX_VALUE);
		
		float resultadoReal = c.getSaldo();
		float resultadoEsperado = 0.0f;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void ingresar3 () 
	{
		Cuenta c = new Cuenta();
//		c.ingresar(0.0f);
		
		float resultadoReal = c.getSaldo();
		float resultadoEsperado = 0.0f;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void retirar1 () 
	{
		Cuenta c = new Cuenta();
		c.ingresar(20.0f);
		c.retirar(10.0f);
		
		float resultadoReal = c.getSaldo();
		float resultadoEsperado = 10.0f;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void retirar2 () 
	{
		Cuenta c = new Cuenta();
		c.ingresar(20.0f);
//		c.retirar(Float.MAX_VALUE);
		
		float resultadoReal = c.getSaldo();
		float resultadoEsperado = 20.0f;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void retirar3 () 
	{
		Cuenta c = new Cuenta();
		c.ingresar(20.0f);
//		c.retirar(0.0f);
		
		float resultadoReal = c.getSaldo();
		float resultadoEsperado = 20.0f;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void transferir1 () 
	{
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.ingresar(20.0f);
		c1.transferir(c2, 10.0f);
		
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};
		float[] resultadoEsperado = {10.0f, 10.0f};
		
		assertArrayEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void transferir2 () 
	{
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.ingresar(20.0f);
//		c1.transferir(c2, Float.MAX_VALUE);
		
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};
		float[] resultadoEsperado = {20.0f, 0.0f};
		
		assertArrayEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void transferir3 () 
	{
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.ingresar(20.0f);
//		c1.transferir(c2, 0.0f);
		
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};
		float[] resultadoEsperado = {20.0f,  0.0f};
		
		assertArrayEquals(resultadoReal, resultadoEsperado);
	}
}