public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Ejemplos de funciones trigonométricas habituales:");
        int angulo = 40;
        int x = 2;
        int y = 3;
        System.out.println("Para un ángulo de 40 radianes:");
        System.out.println ("Seno: " + Math.round(Math.sin(40)*100)/100d);
        System.out.println ("Coseno: " + Math.round(Math.cos(40)*100)/100d);
        System.out.println ("Tangente: " + Math.round(Math.tan(40)*100)/100d);
        System.out.println ("Arcotangente: " + Math.round(Math.atan(40)*100)/100d);
        System.out.println("Para una coordenada x = 2 y una coordenada y = 3");
        System.out.println ("Arcotangente de 2 parámetros: " + Math.round(Math.atan2(x,y)*100)/100d);
        System.out.println("");
        System.out.println("Ejemplos de la función exponencial y su inversa:");
        int cubo = 3;
        int diez = 10;
        System.out.println("Numero e al cubo: " + Math.exp(cubo));
        System.out.println("Logaritmo natural de 10: " + Math.log(diez));
        System.out.println("");
        System.out.println("Ejemplos de las dos constantes PI y e:");
        int diametro = 85;

        System.out.println("Perímetro de un círculo de 85 cm de diámetro: " + Math.round(Math.PI*diametro * 100) / 100d);
        System.out.println("Número e: " + Math.E);
    }
}
