package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class FactorialTestAct5 {
	
	@ParameterizedTest
	@CsvSource({"-1", "-15", "-399"})
	public void testCalculo1(int a) { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Factorial.calculo(a);
		}, "Numero n no puede ser < 0");
	}
	
	@ParameterizedTest
	@CsvSource({"999999", "10000000", "4000000"})
	public void testCalculo2(int a) {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			Factorial.calculo(a);
		}, "Overflow, numero n demasiado grande");
	}
	
	@ParameterizedTest
	@CsvSource({"5, 120", "3, 6", "4, 24"})
	public void testCalculo3(int a, int b) {
		double valorEsperado = b;
		double resultado = Factorial.calculo(a);
		assertEquals(valorEsperado, resultado, 0);
	}

}
