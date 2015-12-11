package circulo;
import utiles.*;
/**
 * Implementa las siguientes Clases:
 * - Punto:
 *      Campos: Las coordenadas enteras x e y
 *      Contructor: Con dos parámetros x e y
 *      Método: toString()
 *      
 * - Circulo:
 *      Campos: El centro del circulo y su radio
 *      Contructor: Con dos parámetros: Punto y radio
 *      Método: toString()
 *      
 * - TestCirculo:
 *      Método: main que cree tantos círculos como indique el usuario.
 *      Los datos serán introducidos también por el usuario. Una vez creados
 *      todos, se mostrará el estado de cada uno de ellos.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class TestCirculo {
	public static void main(String[] args) {
		int numeroCirculos;
		
		numeroCirculos=pedirNumeroCirculos();
		Circulo[] circulos=new Circulo[numeroCirculos]; // Creamos un array de círculos
		crearCirculos(circulos,numeroCirculos);
		mostrarDatosCirculos(circulos,numeroCirculos);
	}
	
	/**
	 * Pide al usuario un número posotivo de círculos
	 * @return numeroCirculos número positivo de círculos
	 */
	static int pedirNumeroCirculos(){
		int numeroCirculos;
		do{
			numeroCirculos=Teclado.leerEntero("\nIntroduzca un número positivo de círculos: ");
			if(numeroCirculos<=0)
				System.out.println("\nError. Número incorrecto");
		}while(numeroCirculos<=0);
		return numeroCirculos;
	}

	/**
	 * Crea tantos círculos como se le indican por parámetro
	 * @param circulos array de círculos
	 * @param numeroCirculos número de círculos
	 */
	static void crearCirculos(Circulo[] circulos,int numeroCirculos){
		int radio;
		for (int i=0;i<numeroCirculos;i++) {
			Punto punto=new Punto(leerCoordenada('x'),leerCoordenada('y'));
			radio=leerRadio();	
			circulos[i] = new Circulo(radio,punto);
		}		   
	}
	
	/**
	 * Lee la coordenada
	 * @param coordenada 'x' o 'y'
	 * @return valor dado por el usuario
	 */
	static int leerCoordenada(char coordenada){
		return Teclado.leerEntero("Introduzca el valor de la coordenada "+coordenada+":");
	}
	
	/**
	 * Pide al usuario el radio
	 * @return radio positivo
	 */
	static int leerRadio(){
		int radio;
		do{
			radio=Teclado.leerEntero("\nIntroduzca un radio positivo: ");
			if(radio<=0)
				System.out.println("\nError. Número incorrecto");
		}while(radio<=0);
		return radio;
	}
	
	/**
	 * Muestra el estado de los círculos almacenados en el array
	 * @param circulos array de círculos
	 * @param numeroCirculos número de círculos
	 */
	static void mostrarDatosCirculos(Circulo[] circulos,int numeroCirculos){
		for(int i=0;i<numeroCirculos;i++)
			System.out.println(circulos[i].toString());
	}
}
