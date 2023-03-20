
public class parteTres {
	
	static int sumatoria(int n) {
		
		int inicial = 1;
		int nuevo= 0;
		
		for(int i = 0; i < n; i++) {
			nuevo += inicial;
			inicial ++;
		}
		return nuevo;
		
	}
	
	static int sumatoriaPares(int n) {
		
		int inicial = 0;
		
		for(int i = 2; i < n + 1; i++) {
			if(i % 2 == 0) {
				inicial += i;
			}
		}
		return inicial;
	}
	
	static double potencia(double x, int a) {
		double acumulador = x;
		
		for(int i = 1; i < a; i++) {
			acumulador = acumulador * x;
		}
		return acumulador;
	}
	
	static double factorial(int n) {
		double acumulador = n;
		
		for(int i = n - 1; i > 0; i--) {
			acumulador = acumulador * i;
		}
		return acumulador;
	}
	
	static int cantCifras(int n) {
		String cadena = String.valueOf(n);
		int acumulador = 0;
		for(int i = 0; i < cadena.length(); i++) {
			acumulador ++;
		}
		return acumulador;
	}
	
	 static boolean esDivisible(int n, int m) {
		 if(n % m == 0) {
			 return true;
		 }return false;
	 }

	public static void main(String[] args) {
		System.out.println(esDivisible(10,5));

	}

}
