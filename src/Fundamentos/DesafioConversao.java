package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro salario:");
        String valor1 = teclado.next().replace(",", ".");

        System.out.println("\nInforme o segundo salario:");
        String valor2 = teclado.next().replace(",", ".");


        System.out.println("\nInforme o terceiro salario:");
        String valor3 = teclado.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor2);


        double media = (salario1 + salario2 + salario3) /3;
        System.out.println("a média dos salarios é: " + media);


        teclado.close();
    }
}
