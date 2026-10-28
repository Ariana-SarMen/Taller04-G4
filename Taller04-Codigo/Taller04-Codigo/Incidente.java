package modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> logActualizaciones = new ArrayList<>();
    protected LocalDateTime fechaCerrado;
    protected String tipo;

    private SoporteTecnico atendidoPor;
    private PersonalAcademico ingresadoPor;
    private PersonalAcademico beneficiario;

    public Incidente(int id, String titulo, String descripcion, String tipo,
                     PersonalAcademico ingresadoPor, PersonalAcademico beneficiario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaReportado = LocalDateTime.now();
        this.estado = "Abierto";
        this.ingresadoPor = ingresadoPor;
        this.beneficiario = beneficiario;
        ingresadoPor.agregarIncidenteIngresado(this);
        beneficiario.agregarIncidenteBeneficiario(this);
    }

    public void setAtendidoPor(SoporteTecnico atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    public void actualizar(String estado, String detalle) {
        this.estado = estado;
        logActualizaciones.add(detalle);
    }

    public void cerrar() {
        this.estado = "Cerrado";
        this.fechaCerrado = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }
}
