package Fundamentos.Exercicios;

import java.util.Scanner;

public class TemperaturaCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius:");
        double celsius = entrada.nextDouble();

        double ajuste = 32;
       double fator = 5.0 / 9.0;

        double fahrenheit = (celsius - ajuste) * fator;

        System.out.println("O resultado é :"  + fahrenheit + "f");



        entrada.close();

    }
}
