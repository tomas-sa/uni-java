import java.util.Random;


public class arrays {
	
	static int[] arregloAzar(int n){
		Random azar = new Random();
		int[] datos = new int[n];
		for(int i=0; i<n; i++)
			datos[i] = azar.nextInt(20);
		return datos;
	}
	
	static int[] combinaArreglos(int[] datos1, int[] datos2, int n) {
		// combina dos arreglos en un tercero elemento a elemento
		int[] salida = new int[datos1.length+datos2.length];
			
		for(int i=0; i<n; i++)
		{
			salida[2*i] = datos1[i];
			salida[2*i+1] = datos2[i];
		}
		return salida;
	}

	static int[] combinaArreglos2(int[] datos1, int[] datos2) {
		// combina dos arreglos en un tercero elemento a elemento
		int k =0;
		int[] salida = new int[datos1.length+datos2.length];
		for(int i=0; i<datos1.length; i++)
		{			
			salida[k] = datos1[i];
			salida[k+1] = datos2[i];
			k=k+2;
		}
		return salida;
	}

	public static void main(String[] args) {
		
		
		
		int[] datos1 = arregloAzar(5);
		int[] datos2 = arregloAzar(10);
		int n;
		for(int i=0; i<datos1.length; i++)
			System.out.print(datos1[i] + " ");
		System.out.println();
		for(int i=0; i<datos2.length; i++)
			System.out.print(datos2[i] + " ");
		System.out.println();
		
		if (datos1.length < datos2.length)
			n = datos1.length;
		else
			n = datos2.length;
		
		int[] union = combinaArreglos(datos1, datos2, n);
		// hacer que muestre todos los combinados
		
		for(int i=0; i<n; i++)
			System.out.print(union[i] + " ");
		System.out.println();
	}

}
