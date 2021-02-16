package Modelos;

import java.util.ArrayList;

public class Notas {
    private int cursoID;
    private ArrayList<Double> notas;

    public Notas(int cursoID, double[] notas) {
        this.cursoID = cursoID;
        this.notas = new ArrayList<Double>();
        addNotas(notas);
    }

    public int getCursoID() {
        return cursoID;
    }

    public double[] getNotas() {
        double[] arr = new double[notas.size()];
        for (int i = 0; i <= notas.size() - 1; i++) {
            arr[i] = notas.get(i);
        }
        return arr;
    }

    public void addNotas(double[] notas) {
        for (Double nota :
                notas) {
            this.notas.add(nota);
        }
    }
}
