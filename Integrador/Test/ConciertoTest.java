import Excepciones.NoHayBoletosDisponiblesException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConciertoTest {

    @Test
    void asignarCancion() {
        Banda banda = new Banda("Mi Banda", "Rock", "Historia de la banda");
        Cancion cancion = new Cancion("feliz navidad", 40);
        Concierto concierto = new Concierto(1, banda, "2023-11-10 20:00", "Sala de Conciertos A", 1000);

        concierto.asignarCancion(cancion);

        assertTrue(concierto.getCanciones().contains(cancion));
    }

    @Test
    void asignarListaCanciones() {
        Banda banda = new Banda("Mi Banda", "Rock", "Historia de la banda");
        Concierto concierto = new Concierto(1, banda, "2023-11-10 20:00", "Sala de Conciertos A", 1000);
        Cancion cancion1 = new Cancion("Cancion 1", 30);
        Cancion cancion2 = new Cancion("Cancion 2", 45);

        concierto.asignarListaCanciones(List.of(cancion1, cancion2));

        assertTrue(concierto.getCanciones().contains(cancion1));
        assertTrue(concierto.getCanciones().contains(cancion2));
    }

    @Test
    void agregarBanda() {
        Banda banda1 = new Banda("Banda 1", "Rock", "Historia de la banda");
        Banda banda2 = new Banda("Banda 2", "Pop", "Historia de la banda");
        Concierto concierto = new Concierto(2, banda1, "2023-11-15 21:00", "Sala de Conciertos B", 800);

        concierto.agregarBanda(banda2);

        assertTrue(concierto.getBandas().contains(banda1));
        assertTrue(concierto.getBandas().contains(banda2));
    }

    @Test
    void registrarBoleto() throws NoHayBoletosDisponiblesException {
        Banda banda = new Banda("Mi Banda", "Rock", "Historia de la banda");
        Concierto concierto = new Concierto(3, banda, "2023-11-20 19:30", "Sala de Conciertos C", 1200);
        Boleto boleto = new Boleto(1, 12345, concierto, 50.0);

        concierto.registrarBoleto(boleto);

        assertTrue(concierto.getBoletosVendidos().contains(boleto));
    }

    @Test
    void registrarVariosBoleto() throws NoHayBoletosDisponiblesException {
        Banda banda = new Banda("Mi Banda", "Rock", "Historia de la banda");
        Concierto concierto = new Concierto(4, banda, "2023-12-01 22:00", "Sala de Conciertos D", 1500);
        Boleto boleto1 = new Boleto(2, 56789, concierto, 60.0);
        Boleto boleto2 = new Boleto(3, 67890, concierto, 55.0);

        concierto.registrarVariosBoletos(List.of(boleto1, boleto2));

        assertTrue(concierto.getBoletosVendidos().contains(boleto1));
        assertTrue(concierto.getBoletosVendidos().contains(boleto2));
    }
}