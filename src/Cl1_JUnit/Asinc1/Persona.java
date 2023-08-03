package Cl1_JUnit.Asinc1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private  String apellido;
    private String email;
    private int edad;

    //CONSTRUCTOR


    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    //GETTERS Y SETTERS

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String nombreCompleto () {
        return this.getApellido()+ ", " + this.getNombre();
    }

    public boolean esMayorDeEdad (LocalDate fechaHoy) {
        LocalDate fechaNacimiento = fechaHoy.minusYears(edad);
        return fechaNacimiento.isBefore(fechaHoy.minusYears(18));
    }
}
