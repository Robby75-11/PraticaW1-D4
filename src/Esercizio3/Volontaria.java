package Esercizio3;

public class Volontaria implements CheckIn {
    private final String nome;
    private final int eta;
    private final String cv;

    public Volontaria(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontaria " + nome + " ha iniziato il servizio.");
    }
}

