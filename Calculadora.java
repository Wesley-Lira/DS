
public class Calculadora {
	public int somar(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public double div(int a, int b) {
		if (b == 0){
            throw new DivisaoPorZeroException();
        }
		return a / b;
	}

}
