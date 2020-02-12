package Array;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner teclado = new Scanner(System.in);
		
		double[] notas = new double[10];
		String[] nombres = new String[10];
		
		for (int i=0;i<notas.length;i++) {
			System.out.println("Introduzca el nombre del individuo: ");
			nombres[i]= teclado.next();
			do {
				System.out.println("Introduzca la nota de "+nombres[i]+": ");
				notas[i]=teclado.nextDouble();
			} while(notas[i]>10 || notas[i]< 0);
		}
		String[] notaspalabra = new String[10];
		
		for (int i = 0 ; i<notas.length;i++) {
			if (notas[i]>0 && notas[i]< 5) {
				notaspalabra[i]= "Suspenso";
			}else if (notas[i]>=5 && notas[i]<7) {
				notaspalabra[i]= "Bien";
			}else if (notas[i]>=7 && notas[i]<9) {
				notaspalabra[i]= "Notable";
			}else {
				notaspalabra[i]= "Sobresaliente";
			}
		}
		for (int i = 0 ; i < notas.length; i++) {
			System.out.println(nombres[i]+"  "+notas[i]+"  "+notaspalabra[i]);
		}
	}

}
