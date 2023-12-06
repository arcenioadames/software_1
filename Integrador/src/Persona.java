public abstract class Persona {
    private int cedula;
    private String nombre;
    private String correo;
    private String ubicacion;

    // Constructor
    public Persona( int cedula,String nombre, String correo, String ubicacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }


}