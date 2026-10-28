package modelos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    private Profesor responsable;
    
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    private List<Foro> foros = new ArrayList<>();
    private List<ActividadSumativa> actividadesSumativas = new ArrayList<>();

    public Curso(String id, String nombre, boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
    }

    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

    public void agregarEstudianteEnEspera(Estudiante estudiante) {
        estudiantesEnEsperaDeInscripcion.add(estudiante);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
       
    }

    public void agregarForo(Foro foro) {
        
    }

    public void agregarActividadSumativa(ActividadSumativa actividad) {
        
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public Profesor getResponsable() {
        return responsable;
    }
}
