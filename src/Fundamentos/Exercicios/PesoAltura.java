package Fundamentos.Exercicios;

import java.util.Scanner;

public class PesoAltura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("informe sua altura:");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura) ;

        System.out.println("seu IMC é: " + imc );


    }
}
