
public class arrays3 {
	
	
	
	static int[] sacarElementos(int[]a) {
		int[] salida = new int[(a.length - 2)];
		
		for(int i = 0; i < salida.length; i++) {
			salida[i] = a[i +1];
		}
		return salida;
		
	}

	public static void main(String[] args) {
		
	int[] arreglo = new int[6];
	arreglo[0] = 0;
	arreglo[1] = 1;
	arreglo[2] = 2;
	arreglo[3] = 3;
	arreglo[4] = 4;
	arreglo[5] = 5;
	
	int[] procesado = sacarElementos(arreglo);
	
	for(int i = 0; i < procesado.length ; i++) {
		System.out.println(procesado[i]);
	}
	
	
	}

}
