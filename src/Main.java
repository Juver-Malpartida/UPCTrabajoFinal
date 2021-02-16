import Modelos.Alumno;
import Modelos.Curso;
import Modelos.Notas;
import Modelos.Profesor;

public class Main {
    public static void main(String[] args) {
        Profesor p1 = new Profesor(2020, "Jose", "Pepe", "Sanchez", "Ayala");
        Profesor p2 = new Profesor(2030, "Alberto", "Santos", "Pereyra", "Soliz");
        Profesor p3 = new Profesor(2040, "Miguel", "Cesar", "Richarte", "Casas");

        Curso c1 = new Curso(3020, "Matematicas", p1);
        Curso c2 = new Curso(3030, "Computacion", p2);
        Curso c3 = new Curso(3040, "Comunicacion", p3);

        Curso[] cursos = {c1, c2, c3};

        Alumno a1 = new Alumno(1020, "Josue", "", "Almeyda", "Xyz");
        Alumno a2 = new Alumno(1030, "Jean", "Franco", "Vega", "Ramirez");
        Alumno a3 = new Alumno(1040, "Juver", "", "Malpartida", "Castro");


        Notas n1 = new Notas(3040, new int[] {14, 12, 15, 20, 17});
        //TODO: Try to update notas.
        a1.addNotas(n1);

        Notas n2 = new Notas(3030, new int[] {11, 12, 13, 15, 20});
        a1.addNotas(n2);

        int cursoId = getCursoID("Comunicacion", cursos);
        System.out.println("El promedio en comunicacion es: " + a1.getPromedio(cursoId));

        cursoId = getCursoID("Computacion", cursos);
        System.out.println("El promedio en computacion es: " + a1.getPromedio(cursoId));

        System.out.println("El promedio total es: " + a1.getPromedioTotal());

        //TODO: Generate notas by course.
    }

    private static int getCursoID(String nombre, Curso[] cursos) {
        for (int i = 0; i <= cursos.length - 1; i++) {
            if (cursos[i].getNombre() == nombre) {
                return cursos[i].getID();
            }
        }

        return -1;
    }

}
