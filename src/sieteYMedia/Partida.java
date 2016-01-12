package sieteYMedia;

public class Partida {
	/**
	 * Primer jugador (usuario)
	 */
	private Jugador jugador1;
	
	/**
	 * Segundo jugador (CPU)
	 */
	private Jugador jugador2;
	
	/**
	 * Baraja de cartas
	 */
	private Baraja baraja;

	/**
	 * Constructor por defecto
	 */
	Partida() {
		jugador1= new Jugador();
		jugador1.setNombre(jugador1.pedirNombre());
		setJugador1(jugador1);
		jugador2= new Jugador();
		setJugador2(jugador2);
		baraja= new Baraja();
		setBaraja(baraja);
	}
	
	/**
	 * Constructor que recibe el jugador1, el jugador2 y la baraja
	 * @param jugador1
	 * @param jugador2
	 * @param baraja
	 */
	Partida(Jugador jugador1, Jugador jugador2, Baraja baraja) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.baraja = baraja;
	}

	/**
	 * Lee el jugador1 de la partida
	 * @return jugador1
	 */
	public Jugador getJugador1() {
		return jugador1;
	}

	/**
	 * Escribe el jugador1 de la partida
	 * @param jugador1
	 */
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	/**
	 * Lee el jugador2 de la partida
	 * @return
	 */
	public Jugador getJugador2() {
		return jugador2;
	}

	/**
	 * Escribe el jugador2 de la partida
	 * @param jugador2
	 */
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	/**
	 * Lee la baraja de la partida
	 * @return
	 */
	public Baraja getBaraja() {
		return baraja;
	}
	
	/**
	 * Escribe la baraja de la partida
	 * @param baraja
	 */
	public void setBaraja(Baraja baraja) {
		this.baraja = baraja;
	}
}
