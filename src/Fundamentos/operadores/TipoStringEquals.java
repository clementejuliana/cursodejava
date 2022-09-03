package Fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");


        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);

        //O método next() em java está presente na classe Scanner e é usado para obter a entrada do usuário.
        // Para usar este método, um objeto Scanner precisa ser criado. Este método pode ler a entrada apenas até
        // que um espaço (”“) seja encontrado.
       // String s2 = entrada.next();
        // um objeto Scannerprecisa ser criado. Este método pode ler a entrada até o final da linha.
        // Em outras palavras,
        // ele pode receber entrada até que a linha mude ou uma nova linha e
        // termine a entrada de obter '\ n' ou pressione Enter.
        String s2 = entrada.nextLine();

        System.out.println(s2);
        System.out.println("2" == s2.trim());
        System.out.println("2" .equals(s2.trim()) );

        entrada.close();
    }
}
