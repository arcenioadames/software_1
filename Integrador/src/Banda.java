import java.util.ArrayList;
import java.util.List;

class Banda {
    private String nombre;
    private List<Miembro> miembros;
    private String genero;
    private String historia;

    public Banda(String nombre, String genero, String historia) {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
        this.genero = genero;
        this.historia = historia;
    }

    public void agregarMiembro(Miembro miembro) {
        miembros.add(miembro);
    }

    public String getNombre() {
        return nombre;
    }
    public List<Miembro> getMiembros() {
        return miembros;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

}
