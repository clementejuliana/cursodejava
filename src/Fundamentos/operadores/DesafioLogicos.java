package Fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (v ou f)
        // trabalho na quinta (v ou f)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // operador unário!
        boolean maisSaudavel =!comprouSorvete;

        System.out.println("Comprou TV 50\" ?" + comprouTV50);
        System.out.println("Comprou TV 31\" ?" + comprouTV32);
        System.out.println("comprou sorvete?" + comprouSorvete);
        System.out.println("mais saudavel\"" + maisSaudavel);
    }
}
