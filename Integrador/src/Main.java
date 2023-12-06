import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una banda y agregar miembros
        Banda miBanda = new Banda("Mi Banda", "Rock", "Historia de la banda");
        Miembro miembro1 = new Miembro("Miembro 1", "Guitarra", 5);
        Miembro miembro2 = new Miembro("Miembro 2", "Batería", 7);
        miBanda.agregarMiembro(miembro1);
        miBanda.agregarMiembro(miembro2);

        // Crear una lista de bandas y agregar la banda creada
        List<Banda> bandas = new ArrayList<>();
        bandas.add(miBanda);

        Cancion cancion1 = new Cancion("feliz navidad", 40);
        Concierto concierto = new Concierto(654,miBanda,"2023-11-10 20:00", "Sala de Conciertos A", 1000);
        concierto.asignarCancion(cancion1);

        // Más operaciones con la aplicación

        // Ejemplos de cómo usar la aplicación
        System.out.println("Banda: " + miBanda.getNombre());
        System.out.println("Concierto: " + concierto.getFechaHora());
    }
}
