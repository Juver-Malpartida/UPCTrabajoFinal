package Modelos;

public class Notas {
    private int cursoID;
    private int[] notas;

    public Notas(int cursoID, int[] notas) {
        this.cursoID = cursoID;
        this.notas = notas;
    }

    public int getCursoID() {
        return cursoID;
    }

    public int[] getNotas() {
        return notas;
    }
}
