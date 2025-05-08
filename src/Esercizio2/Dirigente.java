package Esercizio2;

public static void main(String[] args) {
    Dipendente d1 = new DipendenteFullTime("FT001", "produzione", 2500.0);
    Dipendente d2 = new DipendentePartTime("PT001", "vendite", 15.0, 80);
    Dipendente d3 = new Dirigente("DIR001", "amministrazione", 3000.0, 1200.0);

    Dipendente[] dipendenti = { d1, d2, d3 };

    for (Dipendente d : dipendenti) {
        System.out.println("Matricola: " + d.getMatricola());
        System.out.println("Dipartimento: " + d.getDipartimento());
        System.out.println("Stipendio calcolato: " + d.calculateSalary());
        System.out.println("------");
    }
}