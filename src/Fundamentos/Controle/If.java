package Fundamentos.Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média:");
        double media = entrada.nextDouble();

        // precisa de um expressão que retrone verdadeiro, se não vai funcionar
        if (media <= 10 && media >=7.0) {
            System.out.println("Aprovado");
            System.out.println("Parabens!!");
        }
        if(media < 7 && media >= 4.5)
            System.out.println("Recuperação");

        // a expressão dentro do if tem que ser verdadeira ou falsa,
        // se tiver varias expressoes colocar dentro do if, pode ficar grande, então
        // dá para colocar uma variavel do tipo booleano e declarar a variavel e depois atribuir dentro do if

        boolean criterioReprovacao = media < 4.5 && media >=0;
        if(criterioReprovacao){
            System.out.println("Reprovado");
        }



        entrada.close();
    }
}
