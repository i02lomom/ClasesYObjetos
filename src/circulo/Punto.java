package circulo;
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
public class Punto {
	/**
	 * Valor de x en el eje de coordenadas
	 */
	private int x;
	/**
	 * Valor de y en el eje de coordenadas
	 */
	private int y;
	
	/**
	 * Constructor al que se le pasa como argumento los valores de las coordenadas x e y
	 * @param x valor de x
	 * @param y valor de y
	 */
	Punto(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Modifica los valores de las coordenadas x e y
	 * @param x valor de la coordenada x
	 * @param y valor de la coordenada y 
	 */
	void setXY(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	/**
	* Lee la coordenada x
	* @return x coordenada x
	*/
	int getX(){
		return x;
	}
	
	/**
	* Lee la coordenada y
	* @return y coordenada y
	*/
	int getY(){
		return y;
	}
	
	/**
	 * Muestra las coordenadas del punto
	 */
	public String toString(){
		String msj="";
		msj+="("+getX()+","+getY()+")";
		return msj;
	}
}
