package Ejercicio8;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class RaizScanner {

    public static void main(String[] args) {
        int numero;
        double raiz;
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = num.nextInt();
        raiz = sqrt(numero);
        System.out.println("La raíz de " + numero + " es = " + String.format("%.2f",raiz));
    }
}
