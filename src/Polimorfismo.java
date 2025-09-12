public class Polimorfismo {
    public static void main (String[] args){
        Animal mascota;
        mascota= new Perro();
        mascota.hacerSonido();

        mascota= new Gato();
        mascota.hacerSonido();

        mascota= new Animal();
        mascota.hacerSonido();
    }
}
class Animal {
    void hacerSonido(){
        System.out.println("Sonido genérico");
    }
}
class Perro extends Animal{
    void hacerSonido(){
        System.out.println("Guau");
    }
}
class Gato extends Animal{
    void hacerSonido(){
        System.out.println("Miau");
    }
}