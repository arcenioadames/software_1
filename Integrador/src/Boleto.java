/**
 * Boleto
 */
public class Boleto {
    private int idBoleto;
    private int idPersona;
    private Concierto concierto;
    private double valor;
    private Fanatico fanatico;

    public Boleto(int idBoleto, int idPersona, Concierto concierto, double valor, Fanatico fanatico) {
        this.idBoleto = idBoleto;
        this.idPersona = idPersona;
        this.concierto = concierto;
        this.valor = valor;
        this.fanatico = fanatico;
    }

    public Boleto(int idBoleto, int idPersona, Concierto concierto, double valor) {
        this.idBoleto = idBoleto;
        this.idPersona = idPersona;
        this.concierto = concierto;
        this.valor = valor;
        this.fanatico = null;
    }

    public void comprarBoleto() {
        if(concierto!= null && fanatico!=null){
            fanatico.asistirAConcierto(concierto);
        }
    }
}