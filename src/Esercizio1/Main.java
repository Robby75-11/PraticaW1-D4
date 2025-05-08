package Esercizio1;


    public class Main {
        public static void main(String[] args) {
            Dipendente d1 = new Dipendente("A123", 2000.0, "produzione");
            Dipendente d2 = new Dipendente("B456", 2500.0, "vendite");
            Dipendente d3 = new Dipendente("C789", 2200.0, "amministrazione");

            Dipendente[] dipendenti = {d1, d2, d3};

            for (Dipendente d : dipendenti) {
                System.out.println("Matricola: " + d.getMatricola());
            }
        }
    }

