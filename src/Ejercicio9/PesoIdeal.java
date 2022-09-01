package Ejercicio9;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int altura;
        int peso;
        char genero;
        System.out.println("Ingrese la altura en cm");
        altura = ent.nextInt();
        System.out.println("Ingrese genero m o f");
        genero = ent.next().charAt(0);
        if (genero == 'f')
            peso = altura - 120;
        else
            peso = altura - 110;
        System.out.println("El peso ideal es de " + peso + " kg");
    }
}
