package vector;
import utiles.*;
/**
 * Crea la clase vector con el siguiente comportamiento
 *
 * calcularMaximo()
 * calcularMinimo()
 * sumar()
 * calcularMedia()
 *
 * En el constructor, se indicará el tamaño, valores máximo y mínimo para rellenar aleatoriamente
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
class Vector{
	/**
	 * Tamaño del vector
	 */
	private int tamano;
	
	/**
	 * Valor mínimo de los elementos del vector
	 */
	private int minimo;
	
	/**
	 * Valor máximo de los elementos del vector
	 */
	private int maximo;
	
	/**
	 * Vector de enteros
	 */
	private int [] vector;

	Vector(int tamano,int minimo,int maximo){
		this.tamano=tamano;
		this.minimo=minimo;
		this.maximo=maximo;
		vector=new int [this.tamano];
		inicializarVector();
	}
	
	Vector(int [] vector){
		this.vector=vector;
	}

	/**
	 * Introduce valores aleatorios en el vector
	 */
	void inicializarVector(){
		for(int i=0;i<vector.length;i++){
			vector[i]=Utilidades.generarEnteroAleatorio(this.minimo,this.maximo);
		}
	}

	/**
	 * Muestra los elementos del vector
	 */
	public String toString(){
		String msj="";
		for(int i=0;i<vector.length;i++){
			msj+=(vector[i]+"\t");
		}
		return msj;
	}
	
	/**
	 * Calcula el valor máximo del vector
	 * @return maximo
	 */
	int calcularMaximo(){
		int maximo=vector[0];
		for(int i=0;i<vector.length;i++){
			if(vector[i]>maximo)
				maximo=vector[i];
		}
		return maximo;
	}

	/**
	 * Calcula el valor mínimo del vector
	 * @return minimo
	 */
	int calcularMinimo(){
		int minimo=vector[0];
		for(int i=0;i<vector.length;i++){
			if(vector[i]<minimo)
				minimo=vector[i];
		}
		return minimo;
	}
	
	/**
	 * Calcula la suma de los valores del vector
	 * @return suma
	 */
	int sumar(){
		int suma=0;
		for(int i=0;i<vector.length;i++){
			suma+=vector[i];
		}
		return suma;
	}
	
	/**
	 * Calcula la media del vector
	 * @param suma de los elementos del vector
	 * @return media
	 */
	float calcularMedia(){
		return (float)sumar()/(vector.length);
	}
}
