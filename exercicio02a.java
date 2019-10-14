package recursividadeExerciciosExemplos;

import java.util.Scanner;
import java.util.Locale;

import recursividadeExerciciosExemplosFuncoes.funcoesExercicios;

public class exercicio02a {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String resp = funcoesExercicios.umAteN(n);
		
		System.out.println(resp);
	}	
}

