package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionarios

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //tipos numericos reais
        Float salario = 11_455.44F;
        double vendasAcumuladas = 2_991_791_103.01;

        //tipo booleano
        boolean estaDeFerias = false; // true

        //tipo caractere
        String status = "A"; // ativo

        //dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // numeros de viagens
        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);


        System.out.println(id + ": ganha -> " + salario) ;
        System.out.println("ferias" + estaDeFerias) ;
        System.out.println("status" + status) ;
    }
}
