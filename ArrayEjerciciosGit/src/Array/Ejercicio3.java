package Array;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int[] valores= new int[20];
		int[] ordenado = new int[20];
		int contador=0;
		
		for (int i = 0; i<valores.length;i++) {
			valores[i]= (int) (Math.random()*100);
		}
		
		for (int i = 0; i<valores.length;i++) {
			if ((valores[i] % 2) == 0) {
				ordenado[contador]= valores[i];
				contador++;
			}
		}
		for (int i = 0; i<valores.length;i++) {
			if ((valores[i] % 2) != 0) {
				ordenado[contador] = valores[i];
				contador++;
			}
		}
		for (int i = 0; i <valores.length;i++) {
			System.out.println(valores[i]+"  "+ordenado[i]);
		}
	}

}
