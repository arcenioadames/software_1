package Excepciones;

public class NoHayBoletosDisponiblesException extends Exception {
    public NoHayBoletosDisponiblesException(String mensaje) {
        super(mensaje);
    }
}
