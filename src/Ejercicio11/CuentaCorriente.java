package Ejercicio11;

import java.util.Random;

public class CuentaCorriente {
    private long numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaCorriente (String nombreTitular, double saldo) {
        Random ran = new Random();
        this.numeroCuenta = ran.nextLong(1000000);
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta=" + numeroCuenta +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void ingreso(double importe) {
        saldo += importe;
    }

    public void reintegro(double importe) {
        saldo -= importe;
    }

    public void transferir(CuentaCorriente cuenta, double importe) {
        cuenta.ingreso(importe);
        reintegro(importe);
    }
}
