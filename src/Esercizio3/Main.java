package Esercizio3;



public class Main {
    public static void main(String[] args) {

        Dipendente d1 = new Dipendente("FT001", "produzione", 2500.0);
        Dipendente d2 = new Dipendente("PT001", "vendite", 15.0, 80);
        Dipendente d3 = new Dipendente("DIR001", "amministrazione", 3000.0, 1200.0) {
            @Override
            public double calculateSalary() {
                return 0;
            }
        };

        Volontaria v1 = new Volontaria("Maria Rossi", 30, "Laurea in psicologia");
        Volontaria v2 = new Volontaria("Luca Verdi", 25, "Studente in medicina");

        CheckIn[] persone = { d1, d2, d3, v1, v2 };

        for (CheckIn p : persone) {
            p.checkIn();
        }
    }
}

