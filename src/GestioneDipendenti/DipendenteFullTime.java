package GestioneDipendenti;

public class DipendenteFullTime extends Dipendente {
    private final double stipendioMensile;

    public DipendenteFullTime(String matricola, String dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }
    public double getStipendioMensile() {
        return stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}
