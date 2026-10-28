package modelos;

public class Administrador extends Usuario {

    public Administrador(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contrasena) {
        // Crea un usuario nuevo con el rol indicado
    }

    public void asignarPermiso(String usuario) {
        // Asigna permisos al usuario indicado
    }

    public void actualizarSoftware() {
        // Actualiza el software del sistema
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        curso.setResponsable(responsable);
        responsable.agregarCursoACargo(curso);
    }
}
