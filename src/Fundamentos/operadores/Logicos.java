package Fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condiçao2 = 3 > 7;

        System.out.println(condicao1 && condiçao2);
        System.out.println(condicao1 || condiçao2);
        System.out.println(condicao1 ^ condiçao2);
        System.out.println(!condicao1);
        System.out.println(!condiçao2);

        System.out.println("Tabela Verdade E");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false & false);


        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU Exclusivo (xOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);


        System.out.println("\nTabela verdade not");
        System.out.println(!true);
        System.out.println(!false);



    }
}
