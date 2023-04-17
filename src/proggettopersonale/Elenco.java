//package proggettopersonale;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class Elenco{
//private ArrayList<Libreria>scaffale;
//public Elenco(){
//    this.scaffale= new ArrayList<>();
//}
//
//    public void addScaffale(Libreria libreria){
//    scaffale.add(libreria);
//    }
//
//
//    public void stampaLibro() {
//        Libreria primo;
//        for (int i = 0; i < this.size(); i++) {
//            primo = this.get(i);
//            System.out.println("aggiunto libro di:");
//            System.out.println(primo.getNome() + " " + primo.getType());
//        }
//    }
//
//    public void ricercaAutore(String nome) {
//        Libreria secondo;
//        boolean f = false;
//        for (int i = 0; i < this.size(); i++) {
//            secondo = (Libreria) this.get(i);
//            if(nome.equals(secondo)){
//                f=true;
//            }
//            if(f==true){
//                System.out.println("autore trovato");
//            }else {
//                System.out.println("autore non trovato");
//            }
//        }
//
//    }
//
//    public ArrayList<Libreria> getScaffale() {
//        return scaffale;
//    }
//
//    public void setScaffale(ArrayList<Libreria> scaffale) {
//        this.scaffale = scaffale;
//    }
//}
//
