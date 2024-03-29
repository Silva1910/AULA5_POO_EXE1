package view;

public class Teste {

	public static void main(String[] args) throws ArithmeticException {

		System.out.println("Inicio do main");
		try {
			metodo1();
			System.out.println("Fim do main");
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());

		}

	}

	public static void metodo1() throws ArithmeticException {
		System.out.println("Inicio do método 1");
		try {
			metodo2();
			System.out.println("Fim do método 1");
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void metodo2() throws ArithmeticException {
		System.out.println("Inicio do método 2");
		int[] vetor = new int[10];
		try {
			for (int i = 0; i <= 15; i++) {
				vetor[i] = i;
				System.out.println(i);
				if (i == 9) {
					int vlr = vetor[i] / vetor[0];
					System.out.println(vlr);
				}
			}
		} catch (ArithmeticException e) {

			System.err.println(" o numero tem o divisor = 0 ");
		}

		System.out.println("Fim do método 2");
	}
}
