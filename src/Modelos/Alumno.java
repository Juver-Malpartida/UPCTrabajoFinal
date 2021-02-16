package Modelos;

import java.util.ArrayList;
import java.util.Arrays;

public class Alumno {
    private int id;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private ArrayList<Notas> notas;
    private ArrayList<Curso> cursos;

    public Alumno(int ID, String nombre1, String nombre2, String apellido1, String apellido2) {
        id = ID;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        notas = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public int getID() {
        return id;
    }

    public String getNombre() {
        return nombre1 + " " + nombre2 + " " + apellido1 + " " + apellido2;
    }

    public void registrarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            System.out.println("Alumno ya estaba registrado en el curso");
            return;
        }
        curso.saveAlumno(this);
        cursos.add(curso);
    }

    public void addNotas(Curso curso, double... notas) {
        for (Notas n : this.notas) {
            if (n.getCursoID() == curso.getID()) {
                n.addNotas(notas);
                return;
            }
        }

        Notas n1 = new Notas(curso.getID(), notas);
        this.notas.add(n1);
    }

    public double getPromedioPorCurso(Curso curso) {
        Notas notasPorCurso = null;
        for (int i = 0; i <= notas.toArray().length - 1; i++) {
            if (notas.get(i).getCursoID() == curso.getID()) {
                notasPorCurso = notas.get(i);
                break;
            }
        }

        if (notasPorCurso == null) return 0;

        double[] arrNumbers = notasPorCurso.getNotas();
        return getPromedio(arrNumbers);
    }

    private double getPromedio(double[] arrNumbers) {
        double sum = 0;

        for (int a = 0; a <= arrNumbers.length - 1; a++) {
            sum = sum + arrNumbers[a];
        }

        return sum / arrNumbers.length;
    }

    public double getPromedioTotal() {
        double[] promediosArr = new double[notas.size()];
        for (int i = 0; i <= notas.size() - 1; i++) {
            double[] notasPorCurso = notas.get(i).getNotas();
            promediosArr[i] = getPromedio(notasPorCurso);
        }
        return getPromedio(promediosArr);
    }
}
