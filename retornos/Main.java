package estudos.Izequiel.metódos.retornos;

public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("\nExercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Àrea do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área do retângulo: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio: "+ areaTrapezio);
    }
}
