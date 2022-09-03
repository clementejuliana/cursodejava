package Fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // descrimentar
        a++; // a = a + 1;
        a--; // a = a -1;

        ++b; // b = b + 1;
        --b; // b = b -1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio....");
        System.out.println(++a == b--);
        System.out.println(a == b);

        System.out.println(a);
        System.out.println(b);
    }
}

// é importante vc saber quem vem na frente de quem nesse caso quando vc coloca ++a antes da a
//isso significa que vc está apressando p/ fazer um incremento e quando vc coloca primeiro
// operador b--, a variavel primeiro e depois o incremento, significa que vc com menos pressa para executar.