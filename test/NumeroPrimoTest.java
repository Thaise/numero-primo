import static org.junit.Assert.*;

import org.junit.Test;


public class NumeroPrimoTest {

	@Test
	public void numeroPrimo() {
		int numero = 1;
		String resultado = NumeroPrimo.verifica(numero);
		assertEquals("� um n�mero primo!",resultado);
	}

}
