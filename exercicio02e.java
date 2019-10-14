package recursividadeExerciciosExemplos;

import java.util.Scanner;
import java.util.Locale;

import recursividadeExerciciosExemplosFuncoes.funcoesExercicios;

public class exercicio02e {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int v[] = {1,3,3};
		int i = v.length - 1;
		int r = funcoesExercicios.somaVet(v, i);		
		System.out.println(r);
	}	
}

