package modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonalAcademico extends Usuario {
    private List<Incidente> incidentesIngresados = new ArrayList<>();
    private List<Incidente> incidentesBeneficiario = new ArrayList<>();

    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void reportarError(String email, String contenido) {
        // Ingresa un incidente de tipo error
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        // Ingresa un incidente de tipo asesoramiento
    }

    public void comentarEnForo(Foro foro, String comentario) {
        foro.agregarComentario(comentario);
    }

    public void agregarIncidenteIngresado(Incidente incidente) {
        incidentesIngresados.add(incidente);
    }

    public void agregarIncidenteBeneficiario(Incidente incidente) {
        incidentesBeneficiario.add(incidente);
    }
}
