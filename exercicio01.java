package recursividadeExerciciosExemplos;

import java.util.Scanner;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.*;
import recursividadeExerciciosExemplosFuncoes.funcoesExercicios;

public class exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		long resp = funcoesExercicios.calcularExp(x, n);
		
		System.out.println(resp);
		
	}	
}
