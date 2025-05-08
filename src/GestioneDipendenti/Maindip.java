package GestioneDipendenti;

public class Maindip {
    public static void main(String[] args) {
        Dipendente d1 = new DipendenteFullTime("FT001", "produzione", 2000);
        Dipendente d2 = new DipendentePartTime("PT001", "vendite", 15, 100  );
        Dipendente d3 = new Dirigente("DIR001", "amministrazione", 5000, 1500  );

        Dipendente[] dipendenti = { d1, d2, d3 };

        System.out.println("--- Dettagli stipendio dipendenti ---");
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola());
            System.out.println("Dipartimento: " + d.getDipartimento());
            System.out.println("Stipendio calcolato: " + d.calcolaStipendio() + "€\n");
        }
        Volontario v1 = new Volontario("Maria Rossi", 30, "laurea in psicologia");
        Volontario v2 = new Volontario("Luca Verdi", 25, "Studente in medicina");
        CheckIn[] persone = {d1, d2, d3, v1, v2};

        System.out.println("--- Check-in generale ---");
        for (CheckIn persona : persone) {
            persona.checkIn();

        }
    }
}









