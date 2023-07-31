package Cl1_JUnit.Asinc1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    //Constructor

    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    //Getters

     public String getNombreCompleto() {
        return apellido + ", " + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }


    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos

    public String mostrarNombreCompleto (){
        return this.apellido + ", " + this.nombre;
    }

    public boolean esMayorDeEdad (LocalDate fechaHoy) {
        LocalDate fechaNacimiento = fechaHoy.minusYears(18);
        return fechaNacimiento.isBefore(fechaHoy.minusYears(18));
    }
}
