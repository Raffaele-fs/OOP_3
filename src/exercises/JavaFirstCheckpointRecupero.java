package exercises;

public class JavaFirstCheckpointRecupero {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * Classe operazioni dotata di un costruttore che prende due numeri double a e b
     * e quattro metodi che simulano le 4 operazioni, i metodi devono restituire il risultato.
     */
    public static void exercise1() {

        System.out.println("Exercise 1:\n");
        Operazioni operazioni = new Operazioni(2, 4);
        System.out.println("addizione = " + operazioni.addizione());
        System.out.println("divisione = " + operazioni.divisione());
        System.out.println("moltiplicazione = " + operazioni.moltiplicazione());
        System.out.println("sottrtazione = " + operazioni.sottrtazione());

    }

    /**
     * Implementare un metodo di nome
     * stringaCorta che prende come parametro un array di oggetti String e che restituisce la
     * stringa dell’array avente lunghezza minima. Nel caso vi fossero due o più stringhe con la lunghezza
     * minima, il metodo ne deve restituire una arbitrariamente.
     */
    public static void exercise2() {
        System.out.println("Exercise 2:\n");

        String[] input = {"Casa", "Meridiana", "Livelli", "Terrazzo", "Fratello", "Zebra", "Anno"};
        System.out.println(stringaCorta(input));

    }

    public static String stringaCorta(String[] input) {
        String corto = input[0];
        for (int i = 0; i < input.length; i++) {
            if (corto.length() >= input[i].length()) {
                corto = input[i];
            }
        }
        return corto;
    }

    /**
     * Implementare un metodo di nome filtra che
     * prende come parametro un array a di numeri interi e un intero positivo k, e che restituisce un
     * nuovo array b di numeri interi contenente i soli elementi di a che sono divisibili per k. Si faccia in
     * modo che l’array b abbia una dimensione uguale al numero di elementi che deve contenere (non
     * devono cioè esservi posizioni inutilizzate).
     */
    public static void exercise3() {
        System.out.println("Exercise 3:\n");

        int[] input = {12, 5, 22, 13, 66, 14, 16};
        int k = 2;

        int[] input1 = {12, 5, 22, 13, 66, 14, 16};
        int k1 = 3;


        System.out.println("primo array: ");
        filtra(input,k);
        System.out.println("secondo array: ");
            filtra(input1,k1);

    }

    public static void filtra(int[] input, int k) {
        int contatore = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % k == 0) {
                contatore++;
            }
        }
        int[] arrB = new int[contatore];
        int contatorearrB=-1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % k == 0) {
                arrB[contatorearrB+1] = input[i];
                   contatorearrB++;

            }

        }
        for (int elementi: arrB){
            System.out.println(elementi);
        }


    }

}
