import java.util.ArrayList;
import java.util.List;

public class Fanatico extends Persona {
    private List<Banda> bandas;
    private List<String> redesSociales;
    private List<Concierto> conciertosAsistidos;



    public Fanatico(List<Banda> bandas, int cedula, String nombre, String correo, String ubicacion, List<String> redesSociales,
                    List<Concierto> conciertos) {
        super(cedula, nombre, correo, ubicacion);
        this.bandas=bandas;
        this.conciertosAsistidos = conciertos;
        this.redesSociales =redesSociales;
    }

    public void asistirAConcierto(Concierto concierto) {
        conciertosAsistidos.add(concierto);
    }

    public void hacerseFanaticoBanda(Banda banda) {
        bandas.add(banda);
    }

    public void agregarRedesSociales(String redes) {
        redesSociales.add(redes);
    }

    public List<Concierto> getConciertosAsistidos() {
        return conciertosAsistidos;
    }

}