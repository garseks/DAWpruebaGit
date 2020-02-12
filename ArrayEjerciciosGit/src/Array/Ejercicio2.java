package Array;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner teclado = new Scanner(System.in);
		int longitud;
		
		System.out.println("Introduzca el tamaño del array: ");
		longitud = teclado.nextInt();
		
		int[] vector = new int[longitud];
		int media=0;
		
		for (int i = 0; i<vector.length; i++) {
			vector[i]= (int) (Math.random()*100);
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("El valor en posición "+i+" es: "+vector[i]);
			media+=vector[i];
		}
		
		System.out.println("La media de todos los valores es :"+media/longitud);
		
		
	}

}
