package sieteYMedia;

public class Carta {
	/**
	 * Figura de la carta
	 */
	private Figura figura;
	
	/**
	 * Palo de la carta
	 */
	private Palo palo;
	
	/**
	 * Constructor que recibe la figura y el palo de la carta
	 * @param figura de la carta
	 * @param palo de la carta
	 */
	Carta(Figura figura, Palo palo) {
		this.figura = figura;
		this.palo = palo;
	}
	
	/**
	 * Lee la figura de la carta
	 * @return figura de la carta
	 */
	public Figura getFigura() {
		return figura;
	}

	/**
	 * Escribe la figura de la carta
	 * @param figura de la carta
	 */
	public void setFigura(Figura figura) {
		this.figura = figura;
	}

	/**
	 * Lee el palo de la carta
	 * @return
	 */
	public Palo getPalo() {
		return palo;
	}

	/**
	 * Escribe el palo de la carta
	 * @param palo de la carta
	 */
	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		String msj=figura + " de " + palo;
		msj=msj.toLowerCase();
		return "\nCarta sacada: " + msj;
	}
	
	enum Figura {
		AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), SOTA(0.5), CABALLO(0.5), REY(0.5);
		
		/**
		 * Valor que tiene la figura de la carta
		 */
		private double valor;

		/**
		 * Lee el valor de la figura 
		 * @return
		 */
		public double getValor() {
			return valor;
		}

		/**
		 * Escribe el valor de la figura
		 * @param valor
		 */
		public void setValor(double valor) {
			this.valor = valor;
		}

		/**
		 * Constructor que recibe el valor de la figura
		 * @param valor de la figura
		 */
		Figura(double valor){
			this.valor=valor;
		}
	}
	
	enum Palo {
		OROS, COPAS, BASTOS, ESPADAS;
	}
}
