package Modelos;

public class Curso {
    private int ID;
    private String nombre;
    private Profesor profesor;

    public Curso(int ID, String nombre, Profesor profesor) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

}
