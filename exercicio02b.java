package recursividadeExerciciosExemplos;

import java.util.Scanner;
import java.util.Locale;

import recursividadeExerciciosExemplosFuncoes.funcoesExercicios;

public class exercicio02b {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int resp = funcoesExercicios.somarDeumAteN(n);
		
		System.out.println(resp);
	}	
}

