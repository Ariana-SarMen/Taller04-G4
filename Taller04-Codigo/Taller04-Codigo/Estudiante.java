package modelos;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends PersonalAcademico {
    private List<Curso> cursosInscritos = new ArrayList<>();
    private List<Curso> cursosEnEsperaDeInscripcion = new ArrayList<>();

    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void solicitarInscripcionCurso(Curso curso) {
        cursosEnEsperaDeInscripcion.add(curso);
        curso.agregarEstudianteEnEspera(this);
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        // Realiza la actividad sumativa del curso
    }

    public void confirmarInscripcion(Curso curso) {
        cursosEnEsperaDeInscripcion.remove(curso);
        cursosInscritos.add(curso);
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }
}
