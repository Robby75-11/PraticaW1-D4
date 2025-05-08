package GestioneDipendenti;

public abstract class Dipendente {
    private final String matricola;
    private String dipartimento;

    public Dipendente(String matricola, String dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo astratto da implementare nelle sottoclassi
    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola " + matricola + " ha iniziato il turno.");
    }
}

