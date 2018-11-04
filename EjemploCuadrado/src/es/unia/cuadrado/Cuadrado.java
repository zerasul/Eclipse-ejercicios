package es.unia.cuadrado;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		int numero;
		
		System.out.println("Introduzca numero: ");
		Scanner scanner = new Scanner(System.in);
		numero = scanner.nextInt();
		System.out.println("El cuadrado es: "+ (numero*numero));
		scanner.close();
	}
}
