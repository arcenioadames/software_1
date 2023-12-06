
import Excepciones.CancionNoPerteneceAlbumException;
import Excepciones.NoHayAlbumsDisponiblesException;

import java.util.ArrayList;
import java.util.List;



class Album {
    private Banda banda;
    private String titulo;
    private String fechaLanzamiento;
    private List<Cancion> canciones;
    private List<String> criticas;
    private int disponibles;
    private int ventas;
    private List<Cancion> sencillosDestacados;

    public Album(Banda banda, String titulo, int disponibles, String fechaLanzamiento) {
        this.banda = banda;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.disponibles = disponibles;
        this.canciones = new ArrayList<>();
        this.criticas = new ArrayList<>();
        this.ventas = 0;
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void agregarSencilloDestacado(Cancion cancion) throws CancionNoPerteneceAlbumException {
        if(!canciones.contains(cancion)){
            throw new CancionNoPerteneceAlbumException("Esa cancion no pertenece al album");
        }
        sencillosDestacados.add(cancion);
    }

    public void agregarCritica(String critica) {
        criticas.add(critica);
    }

    public void registrarVenta(int cantidad) throws NoHayAlbumsDisponiblesException {
        if (ventas + cantidad > disponibles) {
            throw new NoHayAlbumsDisponiblesException("No albums disponibles ");
        }
        ventas += cantidad;
    }



}
