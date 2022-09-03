package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        final double Fator = 5.0 /9.0;
        final double Ajuste = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - Ajuste) * Fator;
        System.out.println("O resultado é" + celsius +  "C.");

        fahrenheit = 0;
        celsius = (fahrenheit - Ajuste) * Fator;
        System.out.println("O resultado é" + celsius + "C.");


    }
}
