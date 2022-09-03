package Fundamentos.Exercicios;

import java.util.Scanner;

public class TrianguloArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor da base do quadrado: ");
        float base = teclado.nextFloat();

        System.out.println("Informe o valor da altura do quadrado: ");
        float altura = teclado.nextFloat();

        float area = (base * altura) /2 ;

        System.out.println("o valor da area do quadrado é:" + area);


        teclado.close();
    }
}
