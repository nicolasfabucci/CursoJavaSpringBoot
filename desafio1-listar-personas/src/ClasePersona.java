import java.util.Objects;

public class ClasePersona {
    String nombre;
    String apellido;

    public ClasePersona() {
    }

    public ClasePersona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClasePersona)) return false;
        ClasePersona clasePersona = (ClasePersona) o;
        return Objects.equals(nombre, clasePersona.nombre) && Objects.equals(apellido, clasePersona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return nombre + ' ' + apellido;
    }
}
