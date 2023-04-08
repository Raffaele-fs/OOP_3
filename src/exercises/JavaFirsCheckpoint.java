package exercises;

import java.util.List;

public class JavaFirsCheckpoint {
    /**
     *
     *  JAVA 12 CHECKPOINT N.1
     */
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * Scrivi una classe Java in un file separato che rappresenta un conto bancario,
     * con attributi come saldo e numero di conto.
     * Implementa un costruttore per inizializzare il saldo e il numero di conto e i metodi per depositare e prelevare denaro dal conto.
     * Il conto bancario non può andare in scoperto, la banca non ha concesso credito su questo conto.
     */
    public static void exercise1() {
        Double saldo=-10.0;
        Double numeroConto=7.0;
        if (saldo<0){
            System.err.println("errore sei povero");
        }else {
            ContoBancario contoBancario = new ContoBancario(saldo, numeroConto);
            Double deposito = 5.0;
            Double prelievo = 2.0;
            if(contoBancario.deposito(deposito)<0){
                System.err.println("errore sei povero");
            }
            else {
                System.out.println(contoBancario.deposito(deposito));
            }
            if (contoBancario.prelievo(prelievo)<0){
                System.err.println("errore sei povero");
            }else {
                System.out.println(contoBancario.prelievo(prelievo));
            }
        }
    }

    /**
     * Generatore di nomi di band:
     * Crea un metodo che generi casualmente i nomi delle band.
     * Il metodo deve essere in grado di generare nomi basati su alcune categorie come "aggettivo + sostantivo" o "nome città + nome colore".
     * Puoi utilizzare gli elenchi di parole predefiniti o creare i tuoi elenchi personalizzati.
     */
    public static void exercise2() {
        final List<String> AGGETTIVI = List.of("Amazing", "Bold", "Creative", "Daring", "Elegant", "Fantastic", "Great", "Incredible", "Jazzy", "Killer", "Luminous", "Majestic", "Nimble", "Outstanding", "Powerful", "Quirky", "Radiant", "Sleek", "Terrific", "Unique", "Vibrant", "Witty", "Xenial", "Youthful", "Zany");
        final List<String> SOSTANTIVI = List.of("Art", "Beauty", "Craft", "Design", "Energy", "Fashion", "Guru", "Health", "Intelligence", "Joy", "Kindness", "Luxury", "Mastery", "Nature", "Opulence", "Passion", "Quality", "Radiance", "Simplicity", "Technology", "Uniqueness", "Vision", "Wisdom", "X-Factor", "Youth", "Zen");

    }

    /**
     * Scrivi un metodo che prenda una stringa come input e restituisca la stessa stringa,
     * ma con le parole in ordine inverso. Per esempio,
     * se la stringa di input è "ciao come stai",
     * il metodo restituirà "stai come ciao".
     * Stampa il risultato in console.
     */
    public static void exercise3() {

    }


}
