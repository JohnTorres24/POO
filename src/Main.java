public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        System.out.println("Saldo Actual: "+ cuenta.getSaldo());
      }
    }
class CuentaBancaria {
    private double saldo; //Encapsulado(Privado)

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }
}