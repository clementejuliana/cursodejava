package Fundamentos.Exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temmperatura em Fahrenheit:");
        double farenheit = entrada.nextDouble();

        double Ajuste = 32;
        double Fator = 5.0 / 9.0;
        double celsius = (farenheit - Ajuste) * Fator;


        System.out.println("O resultado é " + celsius + " C.");


        entrada.close();
    }
}
