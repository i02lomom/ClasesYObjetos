package lindoGatito;
import utiles.*;

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
public class TestGato {
	public static void main(String[] args) {
		Gato gato = new Gato("Misifu", "Persa", 4);
		int opcion;
		do {
			System.out.println(gato.toString());
			mostrarMenu();
			opcion = Teclado.leerEntero("\nIntroduzca una opcion: ");
			switch (opcion) {
			case 1:
				gato.darDeComer();
				break;
			case 2:
				gato.jugarConGato();
				break;
			case 3:
				gato.dormir();
				break;
			case 4:
				gato.despertar();
				break;
			default:
				System.out.println("\nError. Opcion incorrecta");
			}
		} while ((opcion > 0 || opcion < 5) && gato.estaVivo());
	}

	static void mostrarMenu() {
		System.out.println("\n***********************************");
		System.out.println("*** \t1) Dar de comer\t\t***");
		System.out.println("*** \t2) Jugar con el\t\t***");
		System.out.println("*** \t3) Dormir al gato\t***");
		System.out.println("*** \t4) Despertar al gato\t***");
		System.out.println("***********************************");
	}
}
