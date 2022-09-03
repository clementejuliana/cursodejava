package Fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 1.0;
        String resultado = media >= 7.0 ? "Aprovada." : " em recuperação.";

        System.out.println("O aluno esta\'" + resultado);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota>=7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoFinal = temDesconto ? "sim" : "nao";

        System.out.println("Tem desconto? %s  " + resultadoFinal);
    }
}
