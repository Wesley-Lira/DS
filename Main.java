import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int a = in.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int b = in.nextInt();
		
		System.out.println("Digite a opera��o : +,-,*,/ ");
		String operador = in.next();
		
		switch (operador) {
		
		case ("+"):
			System.out.println("O resultado �: "+c.somar(a, b));
			break;
			
		case ("-"):
			System.out.println("O resultado �: "+c.subtrair(a, b));
			break;
			
		case ("*"):
			System.out.println("O resultado �: "+c.multi(a, b));
			break;
			
		case ("/"):
			System.out.println("O resultado �: "+c.div(a, b));
			break;
		}
	}

}
