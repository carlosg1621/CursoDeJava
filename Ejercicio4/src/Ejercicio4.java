public class Ejercicio4 {

    public static void main(String[] args) {
        String nombre = "Carlos Gabriel Sotelo";
        int edad = 23;
        double salario = 250000.00;
        boolean carnet = true;

        System.out.println ("Mi nombre es " + nombre);
        System.out.println ("Tengo " + edad + " años");
        System.out.println ("Me gustaría ganar $ " + String.format("%.2f",salario) + " por mes");
        if (carnet)
            System.out.println ("Tengo carnet");
        else
            System.out.println ("No tengo carnet");
    }
}