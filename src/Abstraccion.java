public class Abstraccion {
    public static void main(String[] args) {
        Figura f1= new Circulo(5);
        Figura f2= new Rectangulo(4, 6);
        System.out.println(" Area del circulo: "+f1.calcularArea());
        System.out.println(" Area del rectangulo: "+f2.calcularArea());
    }
    }
    abstract  class Figura {
    abstract double calcularArea();
}
class Circulo extends Figura{
    double radio;
    Circulo(double r) {
        this.radio=r ;
    }
    double calcularArea(){
        return  Math.PI* radio* radio;
    }
}
class Rectangulo extends Figura {
    double base, altura;
    Rectangulo(double b, double h){
        this.base=b;
        this.altura=h;
    }
    double calcularArea(){
        return base*altura;
    }
}
