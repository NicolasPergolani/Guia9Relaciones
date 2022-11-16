
package g9_adopcion_2.Entidades;


public class Persona {
    
    
    private String nombre;
    private String apellido;
    private Perro perro;

    public Persona(String nombre, String apellido, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perro = perro;
    }

    public Persona() {
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

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", perro=" + perro + '}';
    }
    
    
    
    
}
