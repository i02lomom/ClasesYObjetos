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
public class Circulo {
	/**
	 * Valor de x en el eje de coordenadas
	 */
	private int x;
	
	/**
	 * Valor de y en el eje de coordenadas
	 */
	private int y;
	
	/**
	 * Radio del círculo
	 */
	private int radio;
	
	/**
	 * Constructor al que se le pasa como argumento el radio y un punto
	 * @param radio valor del radio
	 * @param punto objeto que se compone de x e y
	 */
	Circulo(int radio,Punto punto){
		this.radio=radio;
		this.x=punto.getX();
		this.y=punto.getY();
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
	 * Modifica el valor del radio
	 * @param radio valor del radio
	 */
	void setRadio(int radio){
		this.radio=radio;
	}
	
	/**
	* Lee el radio
	* @return radio del círculo
	*/
	int getRadio(){
		return this.radio;
	}
	
	/**
	* Lee la coordenada x
	* @return x coordenada x
	*/
	int getX(){
		return this.x;
	}
	
	/**
	* Lee la coordenada y
	* @return y coordenada y
	*/
	int getY(){
		return this.y;
	}
	
	/**
	 * Muestra las coordenadas del punto y el radio
	 */
	public String toString(){
		String msj="";
		msj+="Centro: ("+getX()+","+getY()+")\nRadio: "+getRadio();
		return msj;
	}
}
