package Modelos;

import java.util.ArrayList;

public class Curso {
    private int ID;
    private String nombre;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    public Curso(int ID, String nombre, Profesor profesor) {
        this.ID = ID;
        this.nombre = nombre;
        this.profesor = profesor;
        alumnos = new ArrayList<>();
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

    public void saveAlumno(Alumno alumno) {
        if (alumnos.contains(alumno)) {
            return;
        }
        alumnos.add(alumno);
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + getNombre());
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("Alumnos: ");

        double[] promediosArr = new double[alumnos.size()];
        for (int i = 0; i <= alumnos.size() - 1; i++) {
            Alumno alumno = alumnos.get(i);
            double promedioAlumno = alumno.getPromedioPorCurso(this);
            promediosArr[i] = promedioAlumno;
            System.out.println(alumno.getID() + " " + alumno.getNombre() + " " + alumno.getPromedioPorCurso(this));
        }

        System.out.println("Promedio del Curso: " + getPromedio(promediosArr));

        System.out.println("");
    }

    private double getPromedio(double[] arrNumbers) {
        double sum = 0;

        for (int a = 0; a <= arrNumbers.length - 1; a++) {
            sum = sum + arrNumbers[a];
        }

        return sum / arrNumbers.length;
    }
}
