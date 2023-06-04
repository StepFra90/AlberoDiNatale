import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci le righe dell'albero");
        int numPiani = sc.nextInt();
        AlberoDiNatale albero = new AlberoDiNatale(numPiani);
        albero.generaAlbero();
    }
}
