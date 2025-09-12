public class Herencia {
    public static void main (String[] args) {
        Estudiante alumno = new Estudiante();
        alumno.nombre = "Carlos";
        alumno.carrera = "Ingenieria de sistemas";
        alumno.saludar();
        alumno.estudiar();
    }
}
class Persona {
    String nombre;

    void saludar() {
        System.out.println("hola, soy" + nombre);
    }
}
class Estudiante extends Persona{
    String carrera;
    void estudiar(){
        System.out.println(nombre+ " esta estudiando "+ carrera);
    }
}
