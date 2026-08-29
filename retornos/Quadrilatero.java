package estudos.Izequiel.metódos.retornos;

public class Quadrilatero {

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return (baseMaior + baseMenor) * altura / 2;
    }

    public static float area(float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2) / 2;
    }

    public static void xpto() {

        System.out.println("Antes");   //Pode utilizar o return com o void, mas precisa ter uma lógica
        return;                        //bem definida como um if, println e etc
    }

   //public static int abc() {    //neste exemplo, mostra que NÃO deve utilizar o tipo primitivo
        //return 1.6;             //errado referente ao que returna.
    }

