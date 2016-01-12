package sieteYMedia;
import utiles.Teclado;

/**
 * Vamos a codificar el juego de las siete y media. Recuerda que:
 * 
 * 1. A las siete y media se juega con una baraja española de 40 cartas
 * 2. Supongamos que sólo pueden jugar dos jugadores. Inicialmente, que sólo haya un jugador
 * 3. Al principio del juego se indicará el alias de los jugadores implicados. (opcional)
 * 4. Se podrá averiguar el número de partidas ganadas y perdidas por cada jugador. (opcional)
 * 5. Se podrá mostrar el ranking de las partidas jugadas (opcional)
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SieteYMedia {

	public static void main(String[] args) {	
		Partida partida= new Partida();
		do{
			jugarConJugador1(partida);
			jugarConJugador2(partida);
			comprobarResultado(partida);
		}while(continuar("¿Desea jugar otra vez? (s/n): "));
		partida=null;
	}

	/**
	 * Pregunta al usuario si desea continuar pidiéndole un caracter (s/n)
	 * @param mensaje que se mostrará al usuario
	 * @return true si la respuesta es 's' y false si es 'n'
	 */
	public static boolean continuar(String mensaje){
		char respuesta;

        do{
            respuesta=Character.toLowerCase(Teclado.leerCaracter(mensaje));
            if(respuesta!='s' && respuesta!='n')
            	System.out.println("\nError. Respuesta incorrecta.\n");
        }while (respuesta!='s' && respuesta!='n');

        if (respuesta=='s')
            return true;
        return false;
	}
	
	/**
	 * Juega con el jugador1 (usuario) hasta que desee plantarse.
	 * @param partida
	 */
	static void jugarConJugador1(Partida partida){
		double puntuacion=0;
		partida.getJugador1().setPuntuacion(puntuacion);
		do{
			puntuacion = partida.getBaraja().sacarCarta(partida.getBaraja());
			partida.getJugador1().sumarPuntuacion(puntuacion);
			if(!comprobarPuntuacionJugador(partida.getJugador1()))
				break;
		}while(continuar("¿Desea sacar otra carta? (s/n): "));
	}
	
	/**
	 * Juega con el jugador2 (CPU) hasta obtener una puntuación definida
	 * @param partida
	 */
	static void jugarConJugador2(Partida partida){
		double puntuacion=0;
		partida.getJugador2().setPuntuacion(puntuacion);
		do{
			puntuacion = partida.getBaraja().sacarCarta(partida.getBaraja());
			partida.getJugador2().sumarPuntuacion(puntuacion);
			if(!comprobarPuntuacionJugador(partida.getJugador2()))
				break;
		}while(partida.getJugador2().getPuntuacion()<6);
	}
	
	/**
	 * Comprueba la puntuación del jugador
	 * @param jugador cuya puntuación debemos comprobar
	 * @return true si el jugador puede continuar jugando o false si no puede seguir
	 */
	static boolean comprobarPuntuacionJugador(Jugador jugador){
		System.out.println(jugador.toString());
		if(jugador.getPuntuacion()<7.5)
			return true;
		else if(jugador.getPuntuacion()==7.5)
			System.out.println("El jugador "+jugador.getNombre()+" ha obtenido 7.5");
		else
			System.out.println("El jugador "+jugador.getNombre()+" se ha pasado");
		return false;
	}
	
	static void comprobarResultado(Partida partida){
		if(partida.getJugador1().getPuntuacion()>7.5 && partida.getJugador2().getPuntuacion()>7.5)
			System.out.println("\nEl jugador "+partida.getJugador1().getNombre()+" y el jugador "+partida.getJugador2().getNombre()+" se han pasado. Ninguno gana.");
		else if(partida.getJugador1().getPuntuacion()>7.5 && partida.getJugador2().getPuntuacion()<=7.5)
			System.out.println("\nEl jugador "+partida.getJugador1().getNombre()+" se ha pasado. Gana el jugador "+partida.getJugador2().getNombre());
		else if(partida.getJugador1().getPuntuacion()<=7.5 && partida.getJugador2().getPuntuacion()>7.5)
			System.out.println("\nEl jugador "+partida.getJugador2().getNombre()+" se ha pasado. Gana el jugador "+partida.getJugador1().getNombre());
		else{
			if(partida.getJugador1().getPuntuacion()>partida.getJugador2().getPuntuacion())
				System.out.println("\nEl jugador "+partida.getJugador1().getNombre()+" ha ganado.");
			else if(partida.getJugador1().getPuntuacion()<partida.getJugador2().getPuntuacion())
				System.out.println("\nEl jugador "+partida.getJugador2().getNombre()+" ha ganado.");
			else
				System.out.println("\nEl jugador "+partida.getJugador1().getNombre()+" y el jugador "+partida.getJugador2().getNombre()+" han empatado.");
		}
	}
}
