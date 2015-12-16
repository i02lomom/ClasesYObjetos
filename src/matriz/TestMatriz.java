package matriz;
import utiles.Teclado;
/**
 * Se pide poder realizar las distintas operaciones típicas de una matriz:
 * 
 * - Sumar matrices
 * - Restar matrices
 * - Multiplicar matrices
 * - Trasponer una matriz
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class TestMatriz {
	public static void main(String[] args) {
		int opcion;
		
		do{
			System.out.println("\n*******************************************");
			System.out.println("*** \t1) Sumar dos matrices\t\t***");
			System.out.println("*** \t2) Restar dos matrices\t\t***");
			System.out.println("*** \t3) Multiplicar dos matrices\t***");
			System.out.println("*** \t4) Trasponer una matriz\t\t***");
			System.out.println("*** \t5) Salir\t\t\t***");
			System.out.println("*******************************************");
			
			opcion=Teclado.leerEntero("\nIntroduzca una opción: ");
			
			switch(opcion){
				case 1:
					sumar();
					break;
				case 2:
					restar();
					break;
				case 3:
					multiplicar();
					break;
				case 4:
					traspuesta();
					break;
				case 5:
					break;
				default:
					System.out.println("\nError. Opcion incorrecta");
			}	
		}while(opcion!=5);
	}
	
	/**
	 * Realiza la suma de dos matrices
	 */
	static void sumar(){
		Matriz matriz=crearMatriz();
		Matriz matriz2=crearMatriz();
		
		System.out.println("Matriz 1\n"+matriz);
		System.out.println("Matriz 2\n"+matriz2);
		
		Matriz matriz3=matriz.sumar(matriz2);
		if(matriz3!=null)
			System.out.println("Matriz resultado\n"+matriz3);
		else
			System.out.println("\nNo se pueden sumar matrices de distintas dimensiones\n");
	}
	
	/**
	 * Realiza la resta de dos matrices
	 */
	static void restar(){
		Matriz matriz=crearMatriz();
		Matriz matriz2=crearMatriz();
		
		System.out.println("Matriz 1\n"+matriz);
		System.out.println("Matriz 2\n"+matriz2);
		
		Matriz matriz3=matriz.restar(matriz2);
		if(matriz3!=null)
			System.out.println("Matriz resultado\n"+matriz3);
		else
			System.out.println("\nNo se pueden restar matrices de distintas dimensiones\n");
	}
	
	/**
	 * Realiza la multiplicación de dos matrices
	 */
	static void multiplicar(){
		Matriz matriz=crearMatriz();
		Matriz matriz2=crearMatriz();
		
		System.out.println("Matriz 1\n"+matriz);
		System.out.println("Matriz 2\n"+matriz2);
		
		Matriz matriz3=matriz.multiplicar(matriz2);
		if(matriz3!=null)
			System.out.println("Matriz resultado\n"+matriz3);
		else
			System.out.println("\nNo se pueden multiplicar matrices estas matrices\n");
	}
	
	/**
	 * Realiza la traspuesta de una matriz
	 */
	static void traspuesta(){
		Matriz matriz=crearMatriz();
		
		System.out.println("Matriz\n"+matriz);
		Matriz matriz2=matriz.traspuesta();
		System.out.println("Matriz resultado\n"+matriz2);
	}
	
	/**
	 * Pide al usuario la dimensión de la fila o la columna
	 * @param filaColumna cadena que indica si se pide la fila o la columna
	 * @return dimension tamaño de la fila o la columna
	 */
	static int pedirDimension(String filaColumna){
		int dimension;
		do{
			dimension=Teclado.leerEntero("\nIntroduzca la dimension de las "+filaColumna+": ");
			if(dimension<=0)
				System.out.println("\nError. El tamaño debe de ser mayor que cero");
		}while(dimension<=0);
		return dimension;
	}
	
	/**
	 * Pide al usuario el mínimo o el máximo valor de los elementos de la matriz
	 * @param minimoMaximo cadena que indica si se pide el mínimo o el máximo
	 * @return entero introducido por el usuario
	 */
	static int pedirMinimoMaximo(String minimoMaximo){
		return Teclado.leerEntero("\nIntroduzca el "+minimoMaximo+":");
	}
	
	/**
	 * Crea una matriz
	 * @return matriz
	 */
	static Matriz crearMatriz(){
		Matriz matriz=new Matriz(pedirDimension("filas"),pedirDimension("columnas"),
				pedirMinimoMaximo("mínimo"),pedirMinimoMaximo("máximo"));
		return matriz;
	}
}
