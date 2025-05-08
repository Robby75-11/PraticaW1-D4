package GestioneDipendenti;

public class Volontario implements  CheckIn{

    private final String nome;
    private final int eta;
    private final String cv;

    public Volontario(String nome, int eta, String cv) {

        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }
    public String getNome() {
        return  nome;
    }
    public int getEta(){
        return eta;
    }
    public String getCv() {

        return  cv;
    }
    @Override
    public  String toString() {
        return "Volontario{" +
               "nome='" + nome   + '\'' +
                ", età=" + eta +
                ", cv='" + cv + '\'' +
                '}';

    }
}
