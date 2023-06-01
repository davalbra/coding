/**
 * Clase que representa unas vacaciones.
 */
public class Vacation {
  private double costoBase;
  private String destino;
  private double duracion;
  private double cantidadViajeros;

  /**
   * Crea un objeto Vacation con el destino, duración y cantidad de viajeros especificados.
   *
   * @param destino          el destino del viaje.
   * @param duracion         la duración del viaje en días.
   * @param cantidadViajeros la cantidad de viajeros.
   */
  public Vacation(String destino, double duracion, double cantidadViajeros) {
    this.costoBase = 1000;
    this.destino = destino;
    this.duracion = duracion;
    this.cantidadViajeros = cantidadViajeros;
  }

  /**
   * Calcula el costo total de las vacaciones.
   *
   * @return el costo total de las vacaciones, o -1 si el número de viajeros es mayor o igual a 80.
   */
  public double calcularCostoVacaciones() {
    if (cantidadViajeros < 80) {
      double totalConDestino = calcularCostoDestino(costoBase, destino);
      double tcv = calcularCostoViajeros(totalConDestino, cantidadViajeros);
      double totalConDuracion = calcularCostoDuracion(tcv, duracion, cantidadViajeros);
      return totalConDuracion;
    } else {
      return -1;
    }
  }

  /**
   * Calcula el costo adicional según el destino seleccionado.
   *
   * @param costoBase el costo base actual.
   * @param destino   el destino seleccionado.
   * @return el costo total con el adicional del destino.
   */
  private double calcularCostoDestino(double costoBase, String destino) {
    if (destino.equals("París")) {
      return costoBase + 500;
    } else if (destino.equals("Nueva York")) {
      return costoBase + 600;
    }
    return costoBase;
  }

  /**
   * Calcula el costo adicional según la cantidad de viajeros.
   *
   * @param costoBase        el costo base actual.
   * @param cantidadViajeros la cantidad de viajeros.
   * @return el costo total con el adicional de la cantidad de viajeros.
   */
  private double calcularCostoViajeros(double costoBase, double cantidadViajeros) {
    if (cantidadViajeros > 4 && duracion < 10) {
      return (costoBase + costoBase * 0.1);
    } else if (cantidadViajeros > 20) {
      return (costoBase + costoBase * 0.2);
    }
    return costoBase;
  }

  /**
   * Calcula el costo adicional según la duración del viaje.
   *
   * @param costoBase        el costo base actual.
   * @param duracion         la duración del viaje en días.
   * @param cantidadViajeros la cantidad de viajeros.
   * @return el costo total con el adicional de la duración del viaje.
   */
  private double calcularCostoDuracion(double costoBase, double duracion, double cantidadViajeros) {
    if (duracion < 7) {
      return (costoBase + 200);
    } else if (duracion > 30 || cantidadViajeros == 2) {
      return (costoBase - 200);
    }
    return costoBase;
  }
}
