package recursividadeExerciciosExemplosFuncoes;

public class funcoesExercicios {

	// Exercicio 01
	public static int calcularExp(int x, int n) {
		/*
		 * if (n == 0) { return 1; } else { //n = n -1; return calcularExp(x, n - 1); }
		 */

		return (n == 0) ? 1 : calcularExp(x, n - 1);
	}

	// Exercicio 02

	// Exercicio 02 a
	public static String umAteN(int n) {

		/*
		 * if (n == 1) { return "1"; } else { n = n - 1; return umAteN(n) + n; }
		 */

		return (n == 1) ? "1" : umAteN(n - 1) + " " + n;
	}

	// Exercicio 02 b
	public static int somarDeumAteN(int n) {

		/*
		 * if (n == 1) { return 1; } else { n = n - 1; return somarDeumAteN(n) + n; }
		 */

		return (n == 1) ? 1 : somarDeumAteN(n - 1) + n;
	}

	// Exercicio 02 c
	public static String numerosPareszeroAteN(int n) {

		if (n == 0) {
			return "0";
		} else {
			if (n % 2 == 0) {
				return numerosPareszeroAteN(n - 1) + " " + n;
			} else {
				return numerosPareszeroAteN(n - 1);
			}
		}

		// return (n == 0) ? "0" : (n % 2 == 0) ? numerosPareszeroAteN(n - 1) + " " + n
		// : numerosPareszeroAteN(n - 1);
	}
	
	/*public static int numerosPareszeroAteN(int n) {

		if (n == 1) {
			return 1;
		} else {
			if (n % 2 != 0) {
				return numerosPareszeroAteN(n - 1) + n;
			} else {
				return numerosPareszeroAteN(n - 1);
			}
		}

		// return (n == 0) ? "0" : (n % 2 == 0) ? numerosPareszeroAteN(n - 1) + " " + n
		// : numerosPareszeroAteN(n - 1);
	}*/

	// Exercicio 02 d
	public static int fatorialUmAteN(int n) {
		if (n == 0)
			return 1;
		else {
			int resp = n * fatorialUmAteN(n - 1);
			System.out.println("Fat(" + n + ") = " + resp);
			return resp;
		}
	}

	// Exercicio 02 e
	public static int somaVet(int v[], int i) {
		if (i == 0) {
			return v[0];
		} else {
			return somaVet(v, i - 1) + v[i];
		}
	}

	// Exercicio 04
	public static int funcaoExercicio04(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return funcaoExercicio04(n - 1) + funcaoExercicio04(n - 2);
		}
	}
}
