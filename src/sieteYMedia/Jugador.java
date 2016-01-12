package sieteYMedia;
import utiles.*;

public class Jugador {
	/**
	 * Puntuación del jugador
	 */
	private double puntuacion;
	
	/**
	 * Nombre del jugador
	 */
	private String nombre;

	/**
	 * Constructor por defecto
	 */
	Jugador(){
		this.puntuacion=0;
		this.nombre="CPU";
	}

	/**
	 * Constructor que recibe el nombre del jugador
	 * @param nombre del jugador
	 */
	Jugador(String nombre){
		this.puntuacion=0;
		this.nombre = nombre;
	}
	
	/**
	 * Constructor que recibe la puntuación y el nombre del jugador
	 * @param puntuacion del jugador
	 * @param nombre del jugador
	 */
	Jugador(double puntuacion, String nombre) {
		this.puntuacion = puntuacion;
		this.nombre = nombre;
	}
	
	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String pedirNombre(){		
		return Teclado.leerCadena("\nInroduzca el nombre del jugador: ");
	}
	
	public double sumarPuntuacion(double puntuacion){
		this.puntuacion+=puntuacion;
		return this.puntuacion;
	}
	
	@Override
	public String toString() {
		return "Jugador: "+nombre+"\nPuntuación: "+puntuacion+"\n";
	}
	
}
