package Modelos;

import java.util.ArrayList;
import java.util.HashMap;

public class Alumno {
    private int id;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private ArrayList<Notas> notas;

    public Alumno(int ID, String nombre1, String nombre2, String apellido1, String apellido2) {
        id = ID;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        notas = new ArrayList<>();
    }

    public int getID() {
        return id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void addNotas(Notas n1) {
        this.notas.add(n1);
    }

    public double getPromedio(int cursoID) {
        Notas notasPorCurso = null;
        for (int i = 0; i <= notas.toArray().length - 1; i++) {
            if (notas.get(i).getCursoID() == cursoID) {
                notasPorCurso = notas.get(i);
                break;
            }
        }

        if (notasPorCurso == null) return  0;

        int[] arrNumbers = notasPorCurso.getNotas();
        double sum = 0;

        for(int a = 0; a < arrNumbers.length; a++)
        {
            sum = sum + arrNumbers[a];
        }

        double average = sum / arrNumbers.length;
        return average;
    }

    public double getPromedioTotal() {
        double sum = 0;
        for (int i = 0; i <= notas.toArray().length - 1; i++) {
            sum = sum + getPromedio(notas.get(i).getCursoID());
        }

        return sum / notas.toArray().length;
    }
}
