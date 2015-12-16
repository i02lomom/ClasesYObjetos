package matriz;
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
public class Matriz {
	/**
	 * Matriz de enteros
	 */
	private int [][] datos;
	
	/**
	 * Número de filas
	 */
	private int filas;
	
	/**
	 * Número de columnas
	 */
	private int columnas;

	/**
	 * Constructor que recibe el número de filas y de columnas.
	 * @param filas número de filas
	 * @param columnas número de columnas
	 */
	Matriz(int filas,int columnas){
		setFilas(filas);
		setColumnas(columnas);
		datos=new int [this.filas][this.columnas];
		setDatos(datos);
	}
	
	/**
	 * Constructor que recibe el número de filas, columnas, mínimo y máximo.
	 * @param filas número de filas
	 * @param columnas número de columnas
	 * @param minimo valor mínimo que pueden tomar los elementos de la matriz
	 * @param maximo valar máximo que pueden tomar los elementos de la matriz
	 */
	Matriz(int filas,int columnas,int minimo,int maximo){
		if(minimo>maximo){
			minimo=0;
			maximo=10;
		}	
		setFilas(filas);
		setColumnas(columnas);
		datos=new int [this.filas][this.columnas];
		
		for(int i=0;i<datos.length;i++){
			for(int j=0;j<datos[i].length;j++){
				datos[i][j]=(int)Math.round(Math.random()*(minimo-maximo)+maximo);
			}
		}
		setDatos(datos);
	}
	
	/**
	 * Lee el número de filas
	 * @return filas número de filas de la matriz
	 */
	public int getFilas() {
		return this.filas;
	}
	
	/**
	 * Escribe el número de filas de la matriz
	 * @param filas
	 */
	public void setFilas(int filas) {
		if(filas<=0)
			filas=2;
		this.filas = filas;
	}
	
	/**
	 * Lee el número de columnas
	 * @return columnas número de columnas de la matriz
	 */
	public int getColumnas() {
		return this.columnas;
	}

	/**
	 * Escribe el número de columnas de la matriz
	 * @param columnas
	 */
	public void setColumnas(int columnas) {
		if(columnas<=0)
			columnas=2;
		this.columnas = columnas;
	}
	
	/**
	 * Lee la matriz de enteros
	 * @return datos matriz de enteros
	 */
	public int[][] getDatos() {
		return this.datos;
	}
	
	/**
	 * Escribe la matriz de enteros
	 * @param datos matriz de enteros
	 */
	public void setDatos(int[][] datos) {
		this.datos = datos;
	}

	/**
	 * Muestra los datos de la matriz
	 */
	public String toString(){
		String msj="";
		for(int i=0;i<datos.length;i++){
			for(int j=0;j<datos[i].length;j++){
				msj+=(datos[i][j]+"\t");
			}
			msj+="\n";
		}
		return msj;
	}
	
	/**
	 * Suma dos matrices siempre que tengan las mismas dimensiones
	 * @param matriz2 segunda matriz
	 * @return suma resultado de la suma
	 */
	public Matriz sumar(Matriz matriz2){
		if(!mismasDimensiones(matriz2))
			return null;
		Matriz suma=new Matriz(this.filas,this.columnas);
		for(int i=0;i<this.filas;i++){
			for(int j=0;j<this.columnas;j++){
				suma.datos[i][j]=datos[i][j]+matriz2.datos[i][j];
			}
		}
		return suma;
	}
	
	/**
	 * Resta dos matrices siempre que tengan las mismas dimensiones
	 * @param matriz2 segunda matriz
	 * @return resta resultado de la resta
	 */
	public Matriz restar(Matriz matriz2){
		if(!mismasDimensiones(matriz2))
			return null;
		Matriz resta=new Matriz(this.filas,this.columnas);
		for(int i=0;i<this.filas;i++){
			for(int j=0;j<this.columnas;j++){
				resta.datos[i][j]=datos[i][j]-matriz2.datos[i][j];
			}
		}
		return resta;
	}
	
	/**
	 * Multiplica dos matrices siempre que sean multiplicables
	 * @param matriz2 segunda matriz
	 * @return multiplcacion resultado de la multiplicación
	 */
	public Matriz multiplicar(Matriz matriz2){
		if(!sonMultiplicables(matriz2))
			return null;
		Matriz multiplicacion=new Matriz(this.filas,matriz2.columnas);
		for(int i=0;i<multiplicacion.datos.length;i++){
			for(int j=0;j<multiplicacion.datos[i].length;j++){
				for(int k=0;k<datos[0].length;k++){
					multiplicacion.datos[i][j] += datos[i][k]*matriz2.datos[k][j];
				}
			}
		}
		return multiplicacion; 
	}
	
	/**
	 * Realiza la traspuesta de una matriz
	 * @return traspuesta resultado de trasponer la matriz
	 */
	public Matriz traspuesta(){
		Matriz traspuesta=new Matriz(this.columnas,this.filas);
		for(int i=0;i<datos.length;i++){
			for(int j=0;j<datos[i].length;j++){
				traspuesta.datos[j][i]=datos[i][j];
			}
		}
		return traspuesta;
	}
	
	/**
	 * Comprueba que ambas matrices tienen las misma dimensiones
	 * @param matriz2 segunda matriz
	 * @return true si tienen las mismas dimensiones y false cuando no
	 */
	private boolean mismasDimensiones(Matriz matriz2){
		if(this.filas==matriz2.filas && this.columnas==matriz2.columnas)
			return true;
		return false;
	}
	
	/**
	 * Comprueba que ambas matrices son multiplicables
	 * @param matriz2 segunda matriz
	 * @return true si son multiplicables y false si no
	 */
	private boolean sonMultiplicables(Matriz matriz2){
		if(this.columnas==matriz2.filas)
			return true;
		return false;
	}
}
