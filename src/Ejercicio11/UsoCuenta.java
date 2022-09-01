package Ejercicio11;

import java.util.Scanner;

public class UsoCuenta {
    public static void main(String[] args) {
        double transf;
        String nombre;
        Scanner nom = new Scanner(System.in);
        System.out.println("Ingrese nombre titular Cuenta 1:");
        nombre = nom.next();
        CuentaCorriente Cuenta1 = new CuentaCorriente(nombre,1000);
        System.out.println("Ingrese nombre titular Cuenta 2:");
        nombre = nom.next();
        CuentaCorriente Cuenta2 = new CuentaCorriente(nombre,1000);
        Cuenta1.ingreso(4000);
        System.out.println("Antes de la transferencia:");
        System.out.println("Cuenta 1:");
        System.out.println(Cuenta1.toString());
        System.out.println("Cuenta 2:");
        System.out.println(Cuenta2.toString());
        transf = 2500;
        Cuenta1.transferir(Cuenta2,transf);
        System.out.println("Después de la transferencia:");
        System.out.println("Cuenta 1:");
        System.out.println(Cuenta1.toString());
        System.out.println("Cuenta 2:");
        System.out.println(Cuenta2.toString());
    }
}
