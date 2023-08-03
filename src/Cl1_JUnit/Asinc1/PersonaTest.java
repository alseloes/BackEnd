package Cl1_JUnit.Asinc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonaTest {
    @Test
    public void nombreCompletoCorrecto () {
        //DADO
        Persona juan = new Persona("Juan Carlos", "Alvarez", "correo@correo.com",41);
        //CUANDO

        //ENTONCES
        Assertions.assertEquals("Alvarez, Juan Carlos", juan.nombreCompleto());
    }

    @Test
    public void esMayorEdad () {
        //DADO
        Persona juan1 = new Persona("Juan Carlos", "Alvarez", "correo@correo.com",41);
        Persona matias = new Persona( "Matias", "Alvarez", "sucorreo@correo.com", 14);

        //CUANDO
        LocalDate fechaHoy = LocalDate.of(2021, 9, 21);
        //ENTONCES
        Assertions.assertTrue(juan1.esMayorDeEdad(fechaHoy)); //Empleando assertTrue
        Assertions.assertEquals(false, matias.esMayorDeEdad(fechaHoy)); // Empleando assertEquals

    }

}
