package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> lista = new ArrayList<>();
		lista.add(0);
		lista.add(1);
		while (lista.get(lista.size() -1) < 350){
			lista.add(lista.get(lista.size() - 1) + lista.get(lista.size() - 2));
			if(lista.get(lista.size() - 1) > 350) break;
		}
		return lista;
	}

	public static Boolean isFibonacci(Integer a) {
		List<Integer> contemFibonaci = fibonacci();
		//Metodo contains aprendido no QAstacks

		return contemFibonaci.contains(a);
	}

}