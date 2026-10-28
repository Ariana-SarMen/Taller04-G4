package modelos;

import java.time.LocalDateTime;

public abstract class ActividadSumativa {
    protected String titulo;
    protected LocalDateTime fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;

    public ActividadSumativa(String id, String titulo, LocalDateTime fechaDeEntrega,
                             float puntajeMaximo, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public String getId() {
        return id;
    }
}
