package Ejercicio10;

import java.util.Scanner;
import java.util.Random;

public class Adivinador {
    public static void main(String[] args) {
        int numero,rand;
        int cont = 1;
        Random ran = new Random();
        rand = ran.nextInt(101);
        Scanner num = new Scanner(System.in);
        System.out.println("El sistema genera un numero entre 1 y 100 y usted debe adivinarlo.");
        System.out.println("Ingrese un numero entre 1 y 100");
        numero = num.nextInt();
        while (numero < 1 || numero > 100) {
            System.out.println("Fuera de rango. Reintente:");
            numero = num.nextInt();
        }
        while (numero!=rand) {
            if (numero < rand) {
                System.out.println("Es mayor. Ingrese otro numero entre 1 y 100");
                numero = num.nextInt();
                while (numero < 1 || numero > 100) {
                    System.out.println("Fuera de rango. Reintente:");
                    numero = num.nextInt();
                }
            }
            else
            if (numero > rand) {
                System.out.println("Es menor. Ingrese otro numero entre 1 y 100");
                numero = num.nextInt();
                while (numero < 1 || numero > 100) {
                    System.out.println("Fuera de rango. Reintente:");
                    numero = num.nextInt();
                }
            }
            cont++;
        }
        System.out.println("Correcto! El número generado es " + rand + " y ha consumido " + cont + " intentos");
    }
}
