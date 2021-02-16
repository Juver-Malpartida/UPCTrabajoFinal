import Modelos.Alumno;
import Modelos.Curso;
import Modelos.Profesor;

public class Main {
    public static void main(String[] args) {
        //Crear profesores
        Profesor p1 = new Profesor(2020, "Jose", "Pepe", "Sanchez", "Ayala");
        Profesor p2 = new Profesor(2030, "Alberto", "Santos", "Pereyra", "Soliz");
        Profesor p3 = new Profesor(2040, "Miguel", "Cesar", "Richarte", "Casas");
        //Crear cursos
        Curso c1 = new Curso(3020, "Matematicas", p1);
        Curso c2 = new Curso(3030, "Computacion", p2);
        Curso c3 = new Curso(3040, "Comunicacion", p3);
        //Crear alumnos
        Alumno a1 = new Alumno(1020, "Josue", "Luis", "Almeyda", "Huaman");
        Alumno a2 = new Alumno(1030, "Jean", "Franco", "Vega", "Ramirez");
        Alumno a3 = new Alumno(1040, "Juver", "", "Malpartida", "Castro");

        //Registrar alumnos en cursos y sus notas
        a1.registrarCurso(c1);
        a1.addNotas(c1, 14, 12, 15, 20);
        a1.addNotas(c1, 17);
        a1.registrarCurso(c2);
        a1.addNotas(c2, 11, 12, 13, 15, 20);

        a2.registrarCurso(c2);
        a2.addNotas(c2, 11);
        a2.addNotas(c2, 12, 10);
        a2.addNotas(c2, 7);
        a2.addNotas(c2, 9);
        a2.registrarCurso(c3);
        a2.addNotas(c3, 20, 17, 19, 18, 20);

        a3.registrarCurso(c1);
        a3.addNotas(c1, 15, 16);
        a3.registrarCurso(c2);
        a3.addNotas(c2, 19, 18, 17);
        a3.registrarCurso(c3);
        a3.addNotas(c3, 12, 13);

        System.out.println("El promedio en " + c1.getNombre() + " del alumno " + a1.getNombre() + " es: " + a1.getPromedioPorCurso(c1));
        System.out.println("El promedio en " + c2.getNombre() + " del alumno " + a1.getNombre() + " es: " + a1.getPromedioPorCurso(c2));
        System.out.println("El promedio total del alumno " + a1.getNombre() + " es: " + a1.getPromedioTotal());
        System.out.println("");
        System.out.println("El promedio en " + c2.getNombre() + " del alumno " + a2.getNombre() + " es: " + a2.getPromedioPorCurso(c2));
        System.out.println("El promedio en " + c3.getNombre() + " del alumno " + a2.getNombre() + " es: " + a2.getPromedioPorCurso(c3));
        System.out.println("El promedio total del alumno " + a2.getNombre() + " es: " + a2.getPromedioTotal());
        System.out.println("");
        System.out.println("El promedio en " + c1.getNombre() + " del alumno " + a3.getNombre() + " es: " + a3.getPromedioPorCurso(c1));
        System.out.println("El promedio en " + c2.getNombre() + " del alumno " + a3.getNombre() + " es: " + a3.getPromedioPorCurso(c2));
        System.out.println("El promedio en " + c3.getNombre() + " del alumno " + a3.getNombre() + " es: " + a3.getPromedioPorCurso(c3));
        System.out.println("El promedio total del alumno " + a3.getNombre() + " es: " + a3.getPromedioTotal());

        //Mostrar cursos informacion
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
    }
}
