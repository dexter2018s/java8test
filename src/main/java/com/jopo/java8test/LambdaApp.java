package com.jopo.java8test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LambdaApp {
	public static void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		lista.add("Code");
		lista.add("Mito");

		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

	public static double calcular() {
		Operacion op = (a, b) -> (a + b) / 2;
		return op.calcularPromedio(2, 3);
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		// ordenar();
		System.out.println(calcular() + "");

	}
}
