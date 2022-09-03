package Fundamentos.Exercicios;

import java.util.Scanner;

public class ValorQuadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o valor do quadrado:");
        double valor1 = entrada.nextDouble();

        System.out.println("informe o valor do cubo");
        double valor2 = entrada.nextDouble();

        double quadrado = Math.pow(valor1,2);
        double cubo = Math.pow(valor2,3);


        double resultado1 = quadrado;
        double resultado2 = cubo;

        System.out.print("o valor do quadrado é: " + resultado1 +
                "\n o valor do cubo é: " + resultado2);

        entrada.close();
    }
}
