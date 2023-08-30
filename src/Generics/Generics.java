package Generics;

public class Generics {
    public static void main(String[] args) {
        String a = "joao";
        String b = "victor";

        System.out.println("Maior entre " + a + " e " + b + " é: " + maior(a,b));
    }

    private static String maior (String primeira, String segunda) {
        if (primeira.compareTo(segunda) > 0)
            return primeira;
        else
            return segunda;
    }
}
