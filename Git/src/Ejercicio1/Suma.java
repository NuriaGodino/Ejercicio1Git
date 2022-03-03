package Ejercicio1;

public class Suma {
	
	private static int acum = 5;
	
	public static int sumaDosNumeros(int a, int b) {
		return a+b;
	}
	
	public static int sumaAcum(int ac) {
		//Probocando conflicto 
		return ac + acum;
	}
	
	
}
