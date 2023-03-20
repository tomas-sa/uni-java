import java.util.Scanner;

public class Hola {
	
	static void imprimirSuma(int a, int b) {
		System.out.println(a + b);
	}
	
	static void imprimirPromedio(int a, int b) {
		System.out.println((a + b) / 2);
	}
	
	static void ponerNota(double x, double y) {
		double promediado = (x + y) / 2;
		if(promediado > 7) {
			System.out.println("promocionado");
		}else if(promediado >= 4) {
			System.out.println("aprobado");
		}else {
			System.out.println("debe recuperar");
		}
	}
	static void imprimirFecha(int dia, int mes, int año) {
		
		String mesActual;
		
		if(mes == 1) {
			mesActual = "enero";
		} else if(mes == 2) {
			mesActual = "febrero";
		}
		else if(mes == 3) {
			mesActual = "marzo";
		}
		else if(mes == 4) {
			mesActual = "abril";
		}
		else if(mes == 5) {
			mesActual = "mayo";
		}
		else if(mes == 6) {
			mesActual = "junio";
		}
		else if(mes == 7) {
			mesActual = "julio";
		}
		else if(mes == 8) {
			mesActual = "agosto";
		}
		else if(mes == 9) {
			mesActual = "septiembre";
		}
		else if(mes == 10) {
			mesActual = "octubre";
		}
		else if(mes == 11) {
			mesActual = "noviembre";
		}
		else if(mes == 12) {
			mesActual = "diciembre";
		} else {
			mesActual = "invalido";
		}
		
		System.out.println(dia+" de "+ mesActual+ " de "+ año);
		
	}

	
	public static void main(String[] args) {
		imprimirFecha(5,10,1889);
	}

}
