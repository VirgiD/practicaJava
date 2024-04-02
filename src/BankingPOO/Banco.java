package BankingPOO;

public class Banco {
    public static void main(String[] args) {

        CuentaBancaria Cuenta1= new CuentaBancaria(0,1);
        Cuenta1.depositar(100);
        Cuenta1.consultarSaldo();
        Cuenta1.retirar(50);
    }
}
