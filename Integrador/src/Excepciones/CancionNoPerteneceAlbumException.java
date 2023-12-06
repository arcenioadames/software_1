package Excepciones;

public class CancionNoPerteneceAlbumException extends Exception {
    public CancionNoPerteneceAlbumException(String mensaje) {
        super(mensaje);
    }
}