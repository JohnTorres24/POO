record People (String nombre, int edad) {}
public class Records {
        public static void main(String[] args) {
            People p = new People("Ana", 20);
            System.out.println(p.nombre() + " - " + p.edad());
        }
    }
