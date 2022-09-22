package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora c;

	@Before
	public void setUpBeforeClass() {
		c=new Calculadora();
	}

	@Test
	public void Suma() {
		assertEquals("8+4",12.0,c.suma(8, 4),0.001);
	}
	@Test
	public void Resta() {
		assertEquals("8-4",4,c.resta(8, 4),0);
	}
	@Test
	public void Divisio() {
		assertEquals("8/4",2,c.divide(8, 4),.1);
	}
	@Test
	public void Multiplicacio() {
		assertEquals("8*4",32,c.multiplica(8, 4),0);
	}

}
