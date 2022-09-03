package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero:");
         double lernum1 = entrada.nextDouble();

        System.out.println("Digite o numero:");
         double lernum2 = entrada.nextDouble();

        System.out.println("Informe a operação:");
        String operacao = entrada.next();

        // lOGICA

        Double resultado = "+".equals(operacao) ? lernum1 + lernum2 : 0;
        resultado = "-".equals(operacao) ? lernum1 - lernum2 : resultado;
        resultado = "*".equals(operacao) ? lernum1 * lernum2 : resultado;
        resultado = "/".equals(operacao) ? lernum1 / lernum2 : resultado;
        resultado = "%".equals(operacao) ? lernum1 % lernum2 : resultado;

        System.out.printf("%.2f %s %.2f =", lernum1, operacao, lernum2, resultado);

         entrada.close();
    }
}


//O método equals é utilizado para comparações.
// A classe String e as classes Wrapper sobrescrevem equals() para garantir
// que dois objetos desses tipos, com o mesmo conteúdo, possam ser considerados iguais.

//O ? é o then (então) então retorne