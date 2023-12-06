import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {

    @Test
    void comprarBoleto() {
        // Crear objetos necesarios para la prueba
        Banda banda = new Banda("Mi Banda", "Rock", "Historia de la banda");
        Concierto concierto = new Concierto(1, banda, "2023-12-01 20:00", "Sala de Conciertos A", 1000);
        Fanatico fanatico = new Fanatico(null, 123456, "Fanatico1", "fanatico1@example.com", "Ubicacion1", null, null);
        Boleto boleto = new Boleto(1, 789012, concierto, 50.0, fanatico);

        // Llamar al método comprarBoleto
        boleto.comprarBoleto();

        // Verificar que el Fanatico asista al concierto después de comprar el boleto
        assertTrue(fanatico.getConciertosAsistidos().contains(concierto));
    }
}