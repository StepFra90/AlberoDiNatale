public class AlberoDiNatale {

    private final int numPiani;      //proprietà

    public AlberoDiNatale(int numPiani) {        //costruttore
        this.numPiani = numPiani;
    }


    public void generaAlbero() {
        for (int i = 0; i < numPiani; i++) {            //corpo
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

        for (int i = 0; i < 2; i++) {                         //tronco
            stampaSpazi(numPiani - numPiani / 6);
            stampaStelle(numPiani / 3);
            System.out.println();
        }

        stampaVaso(numPiani - 2, numPiani / 2);   //vaso
        System.out.println();
    }

    private void stampaStelle(int numF) {
        for (int i = 0; i < numF; i++)
            System.out.print("*");
    }

    private void stampaSpazi(int numSp) {
        for (int i = 0; i < numSp; i++)
            System.out.print(" ");
    }

    private void stampaSlash(int numS) {
        for (int i = 0; i < numS; i++)
            System.out.print("/");
    }

    private void stampaBackslash(int numBS) {
        for (int i = 0; i < numBS; i++)
            System.out.print("\\");
    }

    private void stampaVaso(int vaso, int posizione) {
        int a;
        for (a = 0; a < 3; a++) {
            stampaSpazi(posizione + a);
            if (a == 0) {
                System.out.print("[");
                for (int i = 0; i < vaso; i++)
                    System.out.print("_");
                System.out.println("]");
            }
            if (a == 1 && vaso > 2) {
                System.out.print("\\");
                for (int i = 0; i < vaso - 2; i++) {
                    System.out.print("_");
                }
                System.out.println("/");
            }
            if (a == 2 && vaso > 3) {
                System.out.print("\\");
                for (int i = 0; i < vaso - 4; i++) {
                    System.out.print("_");
                }
                System.out.println("/");
            }
        }

    }

}
