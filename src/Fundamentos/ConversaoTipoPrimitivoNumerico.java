package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; // convensão implicita
        System.out.println(a);

        float b = (float) 1.0; // convensão explicita (cast)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //explicita cast
        System.out.println(d);

        double f = 1.0;
        float e = (float) f;
        System.out.println(f);

    }
}
