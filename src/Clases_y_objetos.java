class Coche {
    String marca;
    void conducir() {
        System.out.println("El coche está en movimiento");
    }
}
public class Clases_y_objetos {
        public static void main(String[] args) {
            Coche miCoche = new Coche();
            miCoche.marca = "Toyota";
            miCoche.conducir();
        }
    }
