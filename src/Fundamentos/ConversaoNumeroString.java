package Fundamentos;
// Conversão de numeros para string
// tem varias formas, algumas delas estão aqui em baixo
public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());



        System.out.println(("" + num2).length());
        System.out.println(("" + num1).length());
    }
}
