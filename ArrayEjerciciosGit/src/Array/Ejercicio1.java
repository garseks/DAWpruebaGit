package Array;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] valores = new int[10];
		int[] valoresinv = new int[10];
		
		for(int i=0;i<valores.length;i++) {
			System.out.println("Introduzca un valor para la posición "+i+": ");
			valores[i]=teclado.nextInt();
		}
		for(int i=0; i<valores.length;i++) {
			System.out.println("El valor en la posición "+i+" es: "+valores[i]);
		}
		
		for (int i = 0;i<valores.length;i++) {
			valoresinv[9-i]=valores[i];
		}
		for (int e : valoresinv) {
			System.out.println(e);
		}
		
		
	}
}
