package br.com.codenation.desafioexe;

// GitHub: MarceloSouza1983		e-mail: map_souza1983@gmail.com		Cel: (12) 98813-6040

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> resultado = new ArrayList<Integer>();

		Integer num1 = 0, num2 = 1;

		resultado.add(num1);

		for (int i = 0; i < 20; i++) { // Calcula os 20 primeiros termos de fibonacci
			num1 = num1 + num2;
			num2 = num1 - num2;

			if (num1 > 0 & num1 < 380) { // Adiciona na ArrayList enquanto for < 380
				resultado.add(num1);
			}

		}

		// Imprime a ArrayList
		for (int i = 0; i < resultado.size(); i++) {
			System.out.println(" Posição " + i + " = " + resultado.get(i));
		}
		System.out.println();

		return resultado;
	}
	
	public static Boolean isFibonacci(Integer a) {
		List<Integer> resultado = new ArrayList<Integer>();
		resultado = fibonacci();

		if (resultado.contains(a)) {
			return true;
		} else {
			return false;
		}

	}

}