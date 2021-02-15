package Modelos;

public class Profesor {
    private int ID;
    private String Nombre1;
    private String Nombre2;
    private String Apellido1;
    private String Apellido2;

    public Profesor(int ID, String nombre1, String nombre2, String apellido1, String apellido2) {
        this.ID = ID;
        Nombre1 = nombre1;
        Nombre2 = nombre2;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
    }

    public int getID() {
        return ID;
    }

    public String getNombre1() {
        return Nombre1;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }
}
