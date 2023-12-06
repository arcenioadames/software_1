import java.util.ArrayList;
import java.util.List;

import Excepciones.NoHayBoletosDisponiblesException;

class Concierto {
    private int idConcierto;
    private List<Banda> bandas;
    private String fechaHora;
    private String ubicacion;
    private List<Cancion> canciones;
    private List<Boleto> boletosVendidos;
    private int capacidad;

    public Concierto(int idConcierto, List<Banda> bandas, String fechaHora, String ubicacion, List<Cancion> canciones,
                     List<Boleto> boletosVendidos, int capacidad) {
        this.idConcierto = idConcierto;
        this.bandas = bandas;
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
        this.canciones = canciones;
        this.boletosVendidos = boletosVendidos;
        this.capacidad = capacidad;
    }

    public Concierto(int idConcierto, Banda banda, String fechaHora, String ubicacion, int capacidad) {
        this.idConcierto = idConcierto;
        this.bandas = new ArrayList<>();
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
        this.canciones = new ArrayList<>();
        this.boletosVendidos = new ArrayList<>();
        ;
        this.capacidad = capacidad;
        this.bandas.add(banda);
    }

    public void asignarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void asignarListaCanciones(List<Cancion> cancion) {
        canciones.addAll(cancion);
    }

    public void agregarBanda(Banda banda) {
        bandas.add(banda);
    }

    public void registrarBoleto(Boleto boleto) throws NoHayBoletosDisponiblesException {
        if (boletosVendidos.size() + 1 > capacidad) {
            throw new NoHayBoletosDisponiblesException("No hay más boletos disponibles");
        }
        boletosVendidos.add(boleto);
    }

    public void registrarVariosBoletos(List<Boleto> boletos) throws NoHayBoletosDisponiblesException {
        if (boletosVendidos.size() + boletos.size() > capacidad) {
            throw new NoHayBoletosDisponiblesException("No hay más boletos disponibles");
        }
        boletosVendidos.addAll(boletos);
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public List<Banda> getBandas() {
        return bandas;
    }


    public List<Cancion> getCanciones() {
        return canciones;
    }

    public List<Boleto> getBoletosVendidos() {
        return boletosVendidos;
    }


}