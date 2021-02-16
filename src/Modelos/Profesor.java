package Modelos;

public class Profesor {
    private int id;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;

    public Profesor(int ID, String nombre1, String nombre2, String apellido1, String apellido2) {
        this.id = ID;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre1 + " " + nombre2 + " " + apellido1 + " " + apellido2;
    }
}
