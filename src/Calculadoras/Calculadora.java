package Calculadoras;

public class Calculadora implements CalculadoraBasicaInterface {

	Calculadora() {
		//TODO
	}
	
	@Override
	public float somar(float num1, float num2) throws ArithmeticException {
		// TODO Auto-generated method stub
		try {
			if(num2 == 0) {
				throw new ArithmeticException("Não é possível dividir por zero");
			}
			return num1 + num2;
		} catch (ArithmeticException ae) {
			throw new ArithmeticException("Não é possível dividir por zero");
		}
	}

	@Override
	public float subtrair(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public float multiplicar(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public float dividir(float num1, float num2) throws ArithmeticException {
		// TODO Auto-generated method stub
		try {
			if(num2 == 0) {
				throw new ArithmeticException();
			}
			return num1 / num2;
		} catch(ArithmeticException ae) {
			throw new ArithmeticException();
		}
	}

}
