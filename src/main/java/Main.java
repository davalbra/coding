import java.util.Scanner;

/**
 * Clase principal que permite calcular el costo total de un viaje de
 * vacaciones.
 */
public class Main {

	private Main() {
		// Constructor privado para evitar instanciación
	}

	/**
	 * Método de entrada principal del programa.
	 *
	 * @param args los argumentos des línea de comandos.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, ingrese el destino de su viaje:");
		String destino = scanner.nextLine();
		System.out.println("Ingrese la cantidad de personas que viajarán:");
		int cantidadViajeros = scanner.nextInt();
		System.out.println("Ingrese la duración del viaje en días:");
		int duracion = scanner.nextInt();
		System.out.println("Puedes elegir un Odd");
		System.out.println("1 para All-Inclusive Package - $200 per traveler");
		System.out.println("2 para Adventure Activities Package - $150 per traveler");
		System.out.println("3 para Spa and Wellness Package - $100 per traveler");
		System.out.println("cualquiero otro caracter para salir");
		int odd = scanner.nextInt();
		Vacation vacaciones = new Vacation(destino, duracion, cantidadViajeros, odd);
		double costoTotal = vacaciones.calcularCostoVacaciones();

		if (costoTotal == -1) {
			System.out.println("El número de viajeros no está permitido.");
		} else {
			System.out.println("El costo total del viaje es: " + costoTotal);
		}

		scanner.close();
	}

}
