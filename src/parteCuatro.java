
public class parteCuatro {
	
	static String imprimirReversa(String cadena) {
		String acumulador = "";
		for(int i = cadena.length() - 1; i >= 0 ; i--) {
			acumulador = acumulador + cadena.charAt(i);
		}
		
		return String.valueOf(acumulador);
	}
	
	static int cantidadApariciones(String s, char c) {
		int contador = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				contador ++;
			}
		}
		return contador;
	}
	
	static int cantidadVocales(String s) {
		int contador = 0;
		contador = contador + cantidadApariciones(s, 'a');
		contador = contador + cantidadApariciones(s, 'e');
		contador = contador + cantidadApariciones(s, 'i');
		contador = contador + cantidadApariciones(s, 'o');
		contador = contador + cantidadApariciones(s, 'u');
		return contador;
	}
	
	 static boolean esAbecedaria(String s) {
		 
		 String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		 int indexActual = 0;
		 
		 for(int i = 0; i < s.length(); i++) {
			 for(int j = 0; j < abecedario.length(); j++) {
				 if(s.charAt(i) == abecedario.charAt(j) ) {
					 if(indexActual <= j) {
						 indexActual = j;
					 } else {
						 return false;
					 }
				 }
			 }
		 }
		 return true;
	 }
	 
	 static boolean esCapicua(String s) {
		 String palabra = imprimirReversa(s);
		 if(palabra.equals(s)) {
			 return true;
		 }else {
			 return false;
		 }
	 }



	public static void main(String[] args) {
		System.out.println(esCapicua("neuquen"));

	}

}
