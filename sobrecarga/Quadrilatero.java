package estudos.Izequiel.metódos.sobrecarga;

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("\nÀrea do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Àrea do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Àrea do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Àrea do losango: " + (diagonal1 * diagonal2) / 2);

    }
}
