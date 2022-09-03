package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        // aparece na mesma linha com print, \n é "nova linha"
        System.out.print("Bom");
        System.out.print(" dia \n\n");

        //gera uma saída de texto entre aspas duplas significando uma String,
        // criando uma nova linha e posicionando
        // o cursor na linha abaixo, o que é identificado pela terminação “ln”
        System.out.println("bom");
        System.out.println("dia");

        //O comando usado para exibir valores na tela é a função printf().
        // printf(“Mensagem a ser escrita na tela”);
        // Também é possível mostrar texto e valores de variáveis usando argumentos.
        System.out.printf("Megasena: %d %d %d %d %n" ,1, 2, 3, 4, 5 ,6 );
        System.out.printf("Salario: %.1f%n", 1234.5678);
        System.out.printf("nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.print("digite seu sobrenome");
        String sobrenome = entrada.nextLine();

        System.out.print("digite a sua idade");
        int idade = entrada.nextInt();

        System.out.printf(" %s %s tem %d anos.%n", nome, sobrenome, idade);

        //O método close() de Reader Class em Java é usado para fechar o fluxo e
        // liberar os recursos que estavam ocupados no fluxo,
        // se houver. Este método tem os seguintes resultados:
        // Se o fluxo estiver aberto, ele fecha o fluxo liberando os recursos.
        // Se o stream já estiver fechado, não terá efeito
        entrada.close();

    }
}
