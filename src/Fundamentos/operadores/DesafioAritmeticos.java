package Fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        int a = 3 * 4 -10;
        int b = (int) Math.pow(a, 3);  //pow() é usado para calcular um aumento de número
        double c = Math.pow(a, 3);     // à potência de algum outro número.Esta função aceita dois parâmetros e retorna
                                       // o valor do primeiro parâmetro elevado ao segundo parâmetro


        System.out.println(b);
        System.out.println(c);


    }
}
