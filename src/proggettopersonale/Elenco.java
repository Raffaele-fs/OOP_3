package proggettopersonale;

import java.util.LinkedList;

public class Elenco extends LinkedList<Libreria> {

    public void inserisciLibro(String nome, String type, Integer scaffale) {
        Libreria libreria1 = new Libreria(nome, type, scaffale);
        this.add(libreria1);

    }

    public void stampaLibro() {
        Libreria primo;
        for (int i = 0; i < this.size(); i++) {
            primo = this.get(i);
            System.out.println("aggiunto libro di:");
            System.out.println(primo.getNome() + " " + primo.getType() + "" + primo.getScaffale());
        }
    }

    public void ricercaAutore(String nome) {
        Libreria secondo;
        boolean f = false;
        for (int i = 0; i < this.size(); i++) {
            secondo = (Libreria) this.get(i);
            if(nome.equals(secondo)){
                f=true;
            }
            if(f==true){
                System.out.println("autore trovato");
            }else {
                System.out.println("autore non trovato");
            }
        }

    }
}

