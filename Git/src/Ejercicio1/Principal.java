package Ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Introducimos los numeros
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int suma = Suma.sumaDosNumeros(num1, num2);
		int sumaAcum = Suma.sumaAcum(num3);
		int resta = Resta.restaDosNumeros(num1, num2);
		int restaAcum = Resta.restaAcum(num3);
		
		System.out.println("La suma de los dos numeros introducidos es: " + suma);
		System.out.println("La suma acumulativa es: " + sumaAcum);
		
		System.out.println("La resta de los dos numeros introducidos es: " + resta);
		System.out.println("La resta acumulativa es: " + restaAcum);
		
		sc.close();

	}

}
