import es1.Dipendente;
import es1.enums.Dipartimento;
import es1.enums.Livello;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("001");
        Dipendente dipendente2 = new Dipendente("002",1300,10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        for (int i = 0; i < 4; i++) {
            dipendente2.promuovi();
        }
        System.out.println(dipendente2.toString());
        System.out.println(dipendente2.calcoalPaga(dipendente2, 10));
    }

}