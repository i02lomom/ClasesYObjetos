package vector;
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
public class TestVector{
	public static void main(String[] args){
		Vector vector=new Vector(10,0,10);	//Tamaño, mínimo y máximo
		
		System.out.println(vector);
		System.out.println("\nEl máximo del vector es: "+vector.calcularMaximo());
		System.out.println("El mínimo del vector es: "+vector.calcularMinimo());
		System.out.println("La suma de los elementos es: "+vector.sumar());
		System.out.println("La media del vector es: "+vector.calcularMedia());
	}
}
