package org.singleton;

public class DatosPersonales {
    // Comenzamos con la implementación del Singleton como la instancia.
    private static DatosPersonales instancia;

    // Ahora utilizaremos los atributos propios de la clase
    private String nombre;
    private String apellido1;
    private String apellido2;

    // Importante privatizar el constructor.
    private DatosPersonales() {

    }

    // Generamos el "Constructor" o el método principal que nos ayudará a completar el patrón Singleton.
    public static DatosPersonales getInstancia() {
        if (instancia == null) {
            instancia = new DatosPersonales();
        }
        return instancia;
    }

    // Ahora complementamos con métodos de la clase.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}
