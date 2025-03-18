public class Conta {
    private long numero;
    private double saldo;
    public Conta(long n, double s){
        numero = n;
        saldo = s;
    }
    @Override
    public String toString(){
        return "Conta número" + numero + "tem saldo de R$" + saldo;
    }
}