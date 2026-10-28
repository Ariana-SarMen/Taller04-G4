package modelos;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends PersonalAcademico {
    private List<Curso> cursosACargo = new ArrayList<>();

    public Profesor(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        curso.agregarActividadSumativa(actividadSumativa);
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante,
                                           ActividadSumativa actividadSumativa) {
        // Califica la actividad sumativa del estudiante
    }

    public void aceptarInscripcion(Curso curso, Usuario estudiante) {
        if (estudiante instanceof Estudiante) {
            curso.inscribirEstudiante((Estudiante) estudiante);
        }
    }

    public void crearNuevoForo(Curso curso, Foro foro) {
        curso.agregarForo(foro);
    }

    public void agregarCursoACargo(Curso curso) {
        cursosACargo.add(curso);
    }

    public List<Curso> getCursosACargo() {
        return cursosACargo;
    }
}
