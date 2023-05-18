import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci le righe dell'albero");
        int numPiani = sc.nextInt();
        for (int i = 0; i < numPiani; i++) {
            stampaSpazi(numPiani - i);
            if (i == 0) {
                System.out.println("^");
                continue;
            }
            stampaSlash(1);
            stampaStelle(2 * i - 1);
            stampaBackslash(1);
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            stampaSpazi(numPiani - numPiani / 6);
            stampaStelle(numPiani / 3);
            System.out.println();
        }
        System.out.println();
    }

    public static void stampaStelle(int numF) {
        for (int i = 0; i < numF; i++)
            System.out.print("*");
    }

    public static void stampaSpazi(int numSp) {
        for (int i = 0; i < numSp; i++)
            System.out.print(" ");
    }

    public static void stampaSlash(int numS) {
        for (int i = 0; i < numS; i++)
            System.out.print("/");
    }

    public static void stampaBackslash(int numBS) {
        for (int i = 0; i < numBS; i++)
            System.out.print("\\");
    }
}
