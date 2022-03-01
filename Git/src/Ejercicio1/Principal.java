package Ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Introducimos los numeros
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		Integer suma = Suma.sumaDosNumeros(num1, num2);
		Integer sumaAcum = Suma.sumaAcum(num3);
		
		System.out.println("La suma de los dos numeros introducidos es: " + suma);
		System.out.println("La suma acumulativa es: " + sumaAcum);
		
		sc.close();

	}

}
