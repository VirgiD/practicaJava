package BankingPOO;

public class CuentaBancaria {

        private int numeroCuenta;
        private double saldo = 0;
        private double pesos ;

    public CuentaBancaria(int saldo, int numeroCuenta) {
    }

    public void CuentaBancaria(int numeroCuenta,double saldo,double pesos) {
                numeroCuenta = this.numeroCuenta;
                saldo = this.saldo;
                pesos = this.pesos;
        }

        public void depositar(double pesos){
                this.saldo=+ pesos;
            System.out.println("Se depositaron: "+ pesos +"pesos" );
            System.out.println("Su saldo actual es "+ getSaldo() +"pesos");

        }

        public void consultarSaldo(){
                    this.saldo = saldo;
            System.out.println("Su saldo es: " + getSaldo()+ "pesos");
        }

        public void retirar(double pesos){

        if(saldo >= pesos){
            saldo-=pesos;
            System.out.println("Se retiraron: " + pesos +"pesos");
            System.out.println("Su saldo actual es: " + getSaldo());
        }else
            System.out.println("Su saldo es insuficiente");
        }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
}
