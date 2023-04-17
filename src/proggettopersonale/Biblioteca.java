//package proggettopersonale;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Biblioteca {
//   public Biblioteca(){
//
//    }
//    public void start(){
//        Scanner input = new Scanner(System.in);
//        Elenco elenco=new Elenco();
//        Libreria libreria=new Libreria();
//
//        System.out.println("ciao, benvenuto nella tua libreria, come posso esserti d'aiuto?,seleziona una delle seguenti " +
//                "scelte");
//        System.out.println("1 aggiungere un libro");
//        System.out.println("2 ritirare un libro");
//        System.out.println("3 cerca autore");
//
//        int selezione=input.nextInt();
//
//        switch (selezione){
//            case 1:
//                System.out.println("inserire nome autore");
//                String name=input.next();
//                System.out.println("inserire tipologia libro");
//                String type=input.next();
//                System.out.println("inserire scaffale");
//                Integer scaffale=input.nextInt();
//
//
//                elenco.stampaLibro();
//
//
//                break;
//            case 2:
//                System.out.println("inserire nome autore");
//                System.out.println("inserire tipologia libro");
//                System.out.println();
//            case 3:
//                System.out.println("inserisci autore");
//                String nameAutore= input.next();
//                elenco.ricercaAutore(nameAutore);
//            default:
//                System.out.println("input non valido");
//                break;
//        }
//    }
//}
