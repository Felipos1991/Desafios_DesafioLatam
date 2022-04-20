package com.desafiolatam.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public int suma() {

		boolean verificador = true;
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		do {
			try {

				System.out.println("Ingrese primer número");
				int x = sc.nextInt();

				System.out.println("Ingrese segundo número");
				int y = sc.nextInt();
				suma = x + y;
				verificador = false;

			} catch (InputMismatchException ime) {
				System.out.println("Ingrese solo números. Vuelve a ingresar valores.\n");
				sc.next();
			}
		} while (verificador);

		System.out.println("La suma es: ");
		return suma;
	}

	public int resta() {

		boolean verificador = true;
		int resta = 0;
		Scanner sc = new Scanner(System.in);

		do {
			try {

				System.out.println("Ingrese primer número");
				int x = sc.nextInt();

				System.out.println("Ingrese segundo número");
				int y = sc.nextInt();
				resta = x - y;
				verificador = false;

			} catch (InputMismatchException ime) {
				System.out.println("Ingrese solo números. Vuelve a ingresar valores.\n");
				sc.next();
			}
		} while (verificador);

		System.out.println("La resta es: ");
		return resta;
	}

	public int multiplicacion() {

		boolean verificador = true;
		int multiplicacion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			try {

				System.out.println("Ingrese primer número");
				int x = sc.nextInt();

				System.out.println("Ingrese segundo número");
				int y = sc.nextInt();
				multiplicacion = x * y;
				verificador = false;

			} catch (InputMismatchException ime) {
				System.out.println("Ingrese solo números. Vuelve a ingresar valores.\n");
				sc.next();
			}
		} while (verificador);

		System.out.println("La multiplicacion es: ");
		return multiplicacion;
	}

	public int division() {

		boolean verificador = true;
		int division = 0;
		Scanner sc = new Scanner(System.in);

		do {
			try {

				System.out.println("Ingrese primer número");
				int dividendo = sc.nextInt();

				System.out.println("Ingrese segundo número");
				int divisor = sc.nextInt();
				division = dividendo / divisor;
				verificador = false;

			} catch (InputMismatchException ime) {
				System.out.println("Ingrese solo números. Vuelve a ingresar valores.\n");
				sc.next();
			} catch (ArithmeticException error) {
				System.out.println("Error aritmetico. Ingrese divisor diferente de 0.");
			}

		} while (verificador);

		System.out.println("La division es: ");
		return division;
	}

	public void menu() {

		int opcion = 0;
		do {
		Scanner sc = new Scanner(System.in);

		System.out.println("---------------Calculadora---------------\n");
		System.out.println("Ingrese una operación a realizar");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Salir");
		System.out.println("Opción:");
		opcion = sc.nextInt();

		Calculadora calculadora = new Calculadora();
		switch (opcion) {
		case 1:
			calculadora.suma();
			break;
		case 2:
			calculadora.resta();
			break;
		case 3:
			calculadora.multiplicacion();
			break;
		case 4:
			calculadora.division();
			break;

		}
		}while(opcion<0 || opcion<=4);
		
		System.out.println("Saliendo del programa");
	}
}
