package sieteYMedia;
import utiles.*;

public class Baraja {
	/**
	 * Matriz que contiene las cartas de la baraja
	 */
	private Carta[][] cartas;
	
	/**
	 * Constante que indica el número de figuras distintas en un palo
	 */
	private final static int NUMERO_FIGURAS=10;
	
	/**
	 * Constante que indica el número de palos
	 */
	private final static int NUMERO_PALOS=4;
	
	/**
	 * Constructor por defecto
	 */
	Baraja() {
		Carta[][] cartas=new Carta[NUMERO_FIGURAS][NUMERO_PALOS];
		
		for (Carta.Figura fig : Carta.Figura.values()) {
			for(Carta.Palo palo : Carta.Palo.values()){
				cartas[fig.ordinal()][palo.ordinal()]=new Carta(fig,palo);
			}
		}
		setCartas(cartas);
	}

	/**
	 * Constructor que recibe la matriz que contiene las cartas
	 * @param cartas de la baraja
	 */
	Baraja(Carta[][] cartas) {
		this.cartas = cartas;
	}

	/**
	 * Lee las cartas de la baraja
	 * @return cartas de la baraja
	 */
	public Carta[][] getCartas() {
		return cartas;
	}

	/**
	 * Escribe las cartas de la baraja
	 * @param cartas de la baraja
	 */
	public void setCartas(Carta[][] cartas) {
		this.cartas = cartas;
	}
	
	/**
	 * Saca de forma aleatoria una carta de la baraja
	 * @param cartas matriz que representa la baraja
	 * @return valor de la carta sacada
	 */
	public double sacarCarta(Baraja baraja) {
		int palo,figura;
		double valor;
		
		do{
			palo=generarPalo();
			figura=generarFigura();
		}while(baraja.cartas[figura][palo]==null);
		
		//mostrarCartaSacada(baraja.cartas[figura][palo]);
		System.out.println(baraja.cartas[figura][palo].toString());
		valor=baraja.cartas[figura][palo].getFigura().getValor();
		baraja.cartas[figura][palo]=null;
		return valor;
	}
	
	/*void mostrarCartaSacada(Carta carta){
		String msj=carta.toString();
		msj=msj.toLowerCase();
		System.out.println("\nCarta sacada: " + msj);
	}*/
	
	/**
	 * Genera aleatoriamente un entero que representa el palo
	 * @return entero que representa el palo
	 */
	int generarPalo(){
		return Utilidades.generarEnteroAleatorio(0,3);
	}
	
	/**
	 * Genera aleatoriamente un entero que representa la figura
	 * @return entero que representa la figura
	 */
	int generarFigura(){
		return Utilidades.generarEnteroAleatorio(0,9);
	}
}
