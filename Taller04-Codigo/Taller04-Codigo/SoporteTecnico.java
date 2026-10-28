package modelos;

import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico extends Usuario {
    private List<Incidente> incidentesAtendidos = new ArrayList<>();

    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void brindarAsistencia(Usuario usuario) {
        // Brinda asistencia al usuario indicado
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        // Resuelve el problema técnico del usuario indicado
    }

    public void derivarProblemaDeGestion(Administrador administrador) {
        // Deriva el problema al administrador
    }

    public void atenderIncidente(Incidente incidente) {
        incidente.setAtendidoPor(this);
        incidentesAtendidos.add(incidente);
    }

    public List<Incidente> getIncidentesAtendidos() {
        return incidentesAtendidos;
    }
}
