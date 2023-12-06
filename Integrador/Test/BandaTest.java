import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BandaTest {

    @Test
    void agregarMiembro() {
        Banda banda = new Banda("Mi Banda", "Rock", "Historia de la banda");
        Miembro miembro = new Miembro("Miembro 1", "Guitarra", 5);
        banda.agregarMiembro(miembro);
        assertTrue(banda.getMiembros().contains(miembro));
    }
}