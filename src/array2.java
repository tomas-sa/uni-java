
public class array2 {

	
	 static void intercalar(int[]a, int[]b){
	        int longitud = a.length + b.length;
	        int[] nuevo = new int[longitud];
	        
	        int control = 0;
	        
	        for(int i = 0; i < (longitud/2); i++){
	            nuevo[control] = a[i];
	            nuevo[control+1] = b[i];
	            control += 2;
	        }
	        for(int i = 0; i < nuevo.length; i++){
	            System.out.println(nuevo[i]);
	        }
	    }
	
	
	
	public static void main(String[] args) {
		   int[] lista1 = new int[4];
	         int[] lista2 = new int[4];
	         lista1[0] = 1;
	         lista1[1] = 3;
	         lista1[2] = 5;
	         lista1[3] = 7;
	         lista2[0] = 2;
	         lista2[1] = 4;
	         lista2[2] = 6;
	         lista2[3] = 8;
	         
	         
	         
	        intercalar(lista1, lista2);

	}

}
