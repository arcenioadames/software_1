package Excepciones;

public class NoHayAlbumsDisponiblesException extends Exception {
    public NoHayAlbumsDisponiblesException(String mensaje) {
        super(mensaje);
    }
}
