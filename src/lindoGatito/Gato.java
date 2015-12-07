package lindoGatito;

/**
 * 1. Crea la clase Gato con los siguientes miembros:
 * 
 *    nombre
 *    raza
 *    peso
 *    NO ES NECESARIO: estado (durmiendo, comiendo, jugando) 
 *    comer(). Cambiará su peso (setter)
 *    dormir()
 *    despertar()
 *    jugar(). Cambiará su peso (setter)
 *    morir(). Sólo cuando sobrepase su peso o no llegue
 *    
 * 2. Crea el gato "Misifu" de la raza "Persa" de 4 kilos. 
 * 3. Permítele al usuario que interactúe con él (jugar, comer, dormir, despertar...)
 * 4. Cuando el gato se aproxime a un peso límite, que advierta al usuario que debe
 * hacerle jugar. En caso de superar ese peso límite, que el gato muera.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
class Gato{
	/**
	 * Nombre del gato
	 */
	private String nombre;
	/**
	 * Raza del gato
	 */
	private String raza;
	/**
	 * Peso del gato
	 */
	private int peso;
	/**
	 * Si el gato está vivo o no
	 */
	private boolean Vivo=true;
	

	Gato(String nombre,String raza,int peso) {
		this.nombre=nombre;
		this.raza=raza;
		this.peso=peso;
	}
	
	/**
	 * Muestra los datos del gato
	 */
	public String toString(){
		String msj="\nNombre: "+nombre+"\nRaza: "+this.raza+"\nPeso: "+this.peso;
		msj  += comprobarLimite();
		return msj;
	}
	
	/**
	 * Muestra un mensaje si se llega al peso límite
	 */
	String comprobarLimite(){
		String msj="";
		if(peso>=8 && peso<10)
			msj="\nDeberias jugar mas conmigo humano";
		if(peso<=2 && peso>0)
			msj="\nDeberias darme mas atun humano";
		return msj;
	}
	
	/**
	 * Incrementa el peso del gato
	 */
	void darDeComer(){
		peso++;
		if(peso>=10)
			morir();
	}

	void dormir(){
		System.out.println("\nEstoy durmiendo");
	}

	void despertar(){
		System.out.println("\nEstoy despierto");
	}

	/**
	 * Decrementa el peso del gato
	 */
	void jugarConGato(){
		peso--;
		if(peso<1)
			morir();
	}

	/**
	 * Devuelve el estado del gato que por defecto es vivo
	 */
	public boolean estaVivo(){
		return this.Vivo;
	}
	
	/**
	 * Cambia el estado del gato a muerto
	 */
	void morir(){
		System.out.println("\nEl gato se ha muerto");
		this.Vivo=!this.Vivo;
	}
}
