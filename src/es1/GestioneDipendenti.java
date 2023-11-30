package es1;

import es1.enums.Dipartimento;
import es1.enums.Livello;

public class GestioneDipendenti {

    public static void main(String[] args) {
        Dipendente dipendenteOperaio1 = new Dipendente("003", 1200, 10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente dipendenteOperaio2 = new Dipendente("004",1300,10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente dipendenteImpiegato = new Dipendente("005", 1700, 15, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendenteDirigente = new Dipendente("006", 5000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
        dipendenteOperaio1.promuovi();
        dipendenteImpiegato.promuovi();
        Dipendente[] dipendenti = {dipendenteOperaio1,dipendenteOperaio2,dipendenteImpiegato,dipendenteDirigente};
        for (Dipendente dipendente: dipendenti) {
            System.out.println(dipendente.toString());
        }
        for (Dipendente dipendente: dipendenti) {
            System.out.println(dipendente.calcoalPaga(dipendente,5));
        }
    }
}
