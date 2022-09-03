package Fundamentos.Exercicios;

import java.util.Scanner;

public class EquacoesSegundoGrau {
    public static void main(String[] args) {

        Scanner saida = new Scanner(System.in);

       double a = 1;
       double b = 12;
       double c= -13;

        double delta;
        delta = Math.pow(a, 2);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

       System.out.println("o valor de delta é: " + delta);

        saida.close();

    }


}
