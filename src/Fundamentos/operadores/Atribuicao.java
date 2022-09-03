package Fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // é igual c = c+b;
        c-= a; // é igual c = c-a;
        c *= b; // é igual c = c * b;
        c/= a; // é igual c/ a;



        System.out.println(c);

        c %= 2; // é igual c=c % 2; ou vai dar 0 ou 1
        System.out.println(c);

    }
}
