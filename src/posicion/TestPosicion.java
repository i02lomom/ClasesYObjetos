package posicion;
import utiles.*;
/**
 * Diseña la clase Posicion que represente un punto (x,y) en el eje de coordenadas. 
 * Cada posición viene definida por dos valores enteros x e y. Constará de los siguietes métodos:
 *
 * - Constructor por defecto. Se corresponde con la posición (0,0).
 * 
 * - Constructor al que se le pasa como argumento los valores inciales de las coordenadas x e y.
 * 
 * - Constructor de copia. Se le pasa como argumento un objeto de la misma clase. Se inicializan los 
 * campos del nuevo objeto con los mismos valores de los campos del objeto que se pasa como parámetro.
 * 
 * - Métodos para modificación y consulta (set/get) de los atributos de la clase.
 * 
 * - Métodos para incrementar y decrementar los valores de cada una de las coordenadas de la posición
 * (incX, incY, decX, decY).
 * 
 * - Un método para establecer los valores de las coordenadas (setXY).
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class TestPosicion {
	public static void main(String[] args) {
		mostrarTipoConstructor("Constructor por defecto"); //Mostramos el constructor que vamos a usar
		Posicion posicionPorDefecto=new Posicion(); // Creamos un objeto con el constructor por defecto
		mostrarPosicion(posicionPorDefecto.getX(),posicionPorDefecto.getY());
		
		mostrarTipoConstructor("Constructor con argumentos");
		Posicion posicionDadaPorUsuario= new Posicion(leerCoordenada('x'),leerCoordenada('y'));
		mostrarPosicion(posicionDadaPorUsuario.getX(),posicionDadaPorUsuario.getY());
		
		mostrarTipoConstructor("Constructor copia");
		Posicion posicionCopia= new Posicion(posicionDadaPorUsuario);
		mostrarPosicion(posicionCopia.getX(),posicionCopia.getY());
		
		menu(posicionDadaPorUsuario);
	}
	
	/**
	 * Muestra el tipo de constructor que se va a utlizar
	 * @param msj tipo de constructor
	 */
	static void mostrarTipoConstructor(String msj){
		System.out.println();
		System.out.println("****************************");
		System.out.println(msj);
		System.out.println("****************************");
	}
	
	/**
	 * Muestra la posición en el eje de coordenadas
	 * @param x valor de x
	 * @param y valor de y
	 */
	static void mostrarPosicion(int x,int y){
		System.out.println("La posición actual es: ("+x+","+y+")");
	}
	
	/**
	 * Lee la coordenada
	 * @param coordenada 'x' o 'y'
	 * @return valor dado por el usuario
	 */
	static int leerCoordenada(char coordenada){
		return Teclado.leerEntero("Introduzca el valor de la coordenada "+coordenada+":");
	}
	
	static void menu(Posicion posicionDadaPorUsuario){
		int opcion;
		
		do{
			System.out.println("\n***************************************************");
			System.out.println("*** \t1) Incrementar coordenada x en 1\t***");
			System.out.println("*** \t2) Incrementar coordenada y en 1\t***");
			System.out.println("*** \t3) Decrementar coordenada x en 1\t***");
			System.out.println("*** \t4) Decrementar coordenada y en 1\t***");
			System.out.println("*** \t5) Salir\t\t\t\t***");
			System.out.println("***************************************************");
			
			opcion=Teclado.leerEntero("\nIntroduzca una opción: ");
			
			switch(opcion){
				case 1:
					posicionDadaPorUsuario.incX();
					mostrarPosicion(posicionDadaPorUsuario.getX(),posicionDadaPorUsuario.getY());
					break;
				case 2:
					posicionDadaPorUsuario.incY();
					mostrarPosicion(posicionDadaPorUsuario.getX(),posicionDadaPorUsuario.getY());
					break;
				case 3:
					posicionDadaPorUsuario.decX();
					mostrarPosicion(posicionDadaPorUsuario.getX(),posicionDadaPorUsuario.getY());
					break;
				case 4:
					posicionDadaPorUsuario.decY();
					mostrarPosicion(posicionDadaPorUsuario.getX(),posicionDadaPorUsuario.getY());
					break;
				case 5:
					break;
				default:
					System.out.println("\nError. Opcion incorrecta");	
			}
		}while(opcion!=5);
	}
}
