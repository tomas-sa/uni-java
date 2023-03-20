
public class Recursion {

	public static int potencia(int base, int exp) {
		if(!(exp == 0)) {
			return (base * potencia(base, exp - 1));
		}
		return 1;
	
	}
	
	public static int sumaEntre(int n, int m) {
		if(m >= n) {
			return m + sumaEntre(n, m-1);
		}
		return m + (n -1);
	}
	
	public static boolean esPrimo(int n) {
		
		for(int i = 2 ; i < n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int cantidadPrimosEntre(int n, int m) {
		if(n > m) {
			return 0;
			
		}
		if(esPrimo(n)) {
			return 1 + cantidadPrimosEntre(n+1, m);
		}
		return cantidadPrimosEntre(n+1, m);
	}
	
	
	public static void cantidadPrint(int n) {
		System.out.println(n%10);
		System.out.println(n/10);
	}
	
	
	public static int cantidadDigitos(int n) {
		if(n < 10) {
			return 1;
		}
		return 1+ cantidadDigitos(n / 10);
	}
	
	public static void main(String[] args) {
		System.out.println(cantidadDigitos(15));
		

	}

}
