package Esercizio1;

public class Dipendente {

    private final String matricola;
    private final double stipendio;
    private String dipartimento;

    // Costruttore
    public Dipendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Getter
    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    // Setter per dipartimento
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }
}
