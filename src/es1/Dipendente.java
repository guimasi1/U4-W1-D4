package es1;

import es1.enums.Dipartimento;
import es1.enums.Livello;

public class Dipendente {
    // ATTRIBUTI
    private static final int stipendioBase = 1000;
    private String codiceMatricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    // COSTRUTTORI

    public Dipendente(String codiceMatricola) {
        this.codiceMatricola = codiceMatricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(String codiceMatricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.codiceMatricola = codiceMatricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;

    }



    // GETTER

    public String getCodiceMatricola() {
        return codiceMatricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    // SETTER


    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }
    // METODI

    @Override
    public String toString() {
        return "Dipendente{" +
                "codiceMatricola='" + codiceMatricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public Livello promuovi() {
        switch (this.livello) {
            case OPERAIO:
                this.livello = Livello.IMPIEGATO;
                this.stipendio = stipendioBase * 1.2;
                System.out.println("Promosso ad impiegato.");
                break;
            case IMPIEGATO:
                this.livello = Livello.QUADRO;
                this.stipendio = stipendioBase * 1.5;
                System.out.println("Promosso a quadro.");
                break;
            case QUADRO:
                this.livello = Livello.DIRIGENTE;
                this.stipendio = stipendioBase * 2;
                System.out.println("Promosso a dirigente");
                break;
            case DIRIGENTE:
                System.out.println("Errore: non può essere promosso, poichè già dirigente.");
                break;
            default:
                System.out.println("Errore.");
        }
        return this.livello;
    }

    public double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public double calcolaPaga(Dipendente dipendente, int oreDiStraordinario) {
        return dipendente.getStipendio() + dipendente.importoOrarioStraordinario * oreDiStraordinario;
    }

}
