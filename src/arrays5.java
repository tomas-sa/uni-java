
public class arrays5 {

	
	static int cantRepetidos(int[]a) {
		int acumulador = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] == a[j]) {
					acumulador ++;
				}
			}
		}
		return acumulador;
		
		
	}
	static int[] sinrepetidos(int[]a) {
		int repetidos = cantRepetidos(a);
		//System.out.println(repetidos);
		
		int[] arreglo = new int[a.length - repetidos];
		
		for(int i = 1; i < arreglo.length; i++) {
			
		}
		
		return arreglo;
	}
	
	
	
	public static void main(String[] args) {
		int[] arreglo = new int[8];
		arreglo[0] = 3;
		arreglo[1] = 1;
		arreglo[2] = 2;
		arreglo[3] = 2;
		arreglo[4] = 1;
		arreglo[5] = 5;
		arreglo[6] = 5;
		arreglo[7] = 6;
		
		int[] ultimo = sinrepetidos(arreglo);
		
		for(int i = 0; i< ultimo.length; i++) {
			System.out.println(ultimo[i]);
		}

	}

}
