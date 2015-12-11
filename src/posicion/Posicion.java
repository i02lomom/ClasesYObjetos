package posicion;
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
public class Posicion {
	/**
	 * Valor de x en el eje de coordenadas
	 */
	private int x;
	/**
	 * Valor de y en el eje de coordenadas
	 */
	private int y;
	
	/**
	 * Constructor por defecto
	 */
	Posicion(){
		this.x=0;
		this.y=0;
	}
	
	/**
	 * Constructor al que se le pasa como argumento los valores de las coordenadas x e y
	 * @param x valor de x
	 * @param y valor de y
	 */
	Posicion(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Constructor de copia. Se le pasa como argumento un objeto de la misma clase. 
	 * Se inicializan los campos del nuevo objeto con los mismos valores de los campos del objeto
	 * que se pasa como parámetro.
	 * @param Posicion objeto de la misma clase
	 */
	Posicion(Posicion copia){
		this.x=copia.x;
		this.y=copia.y;
	}
	
	/**
	 * Modifica la coordenada x
	 * @param x valor de la coordenada x
	 */
	void setX(int x){
		this.x=x;
	}
	
	/**
	 * Modifica la coordenada y
	 * @param y valor de la coordenada y
	 */
	void setY(int y){
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
	 * Incrementa la coordenada x
	 */
	void incX(){
		x++;
	}
	
	/**
	 * Incrementa la coordenada y
	 */
	void incY(){
		y++;
	}
	
	/**
	 * Decrementa la coordenada x
	 */
	void decX(){
		x--;
	}
	
	/**
	 * Decrementa la coordenada y
	 */
	void decY(){
		y--;
	}
}
