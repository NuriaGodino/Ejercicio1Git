package Ejercicio1;

public class Suma {
	
	private static int acum = 5;
	
	public static int sumaDosNumeros(int a, int b) {
		return a+b;
	}
	
	public static int sumaAcum(int ac) {
		//Vamos a provocar el conflicto ahora con master
		return ac + acum;
	}
	
	//Cambios en master para provocar fusion de 3 vias sin conflicto 
}
