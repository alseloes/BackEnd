package Cl1_JUnit.Asinc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonaTest {
    @Test
    public void testNombreCompleto () {
        //DADO
        Persona juan = new Persona("Juan Carlos", "Alvarez", "alseloes@gmail.com", 41);
        Persona matias = new Persona("Matias","Alvarez", "email@gmail.com", 14);

        //CUANDO

        //ENTONCES
        Assertions.assertEquals("Alvarez, Juan Carlos", juan.getNombreCompleto() );//Mediante getter
        Assertions.assertEquals("Alvarez, Matias", matias.mostrarNombreCompleto());//Mediante método
    }

    @Test
    public void testEsMayorDeEdad () {
        //DADO
        LocalDate fechaHoy = LocalDate.of(2021, 9, 21);
        Persona juan = new Persona("Juan Carlos", "Alvarez", "alseloes@gmail.com", 41);
        Persona matias = new Persona("Matias","Alvarez", "email@gmail.com", 14);
        //CUANDO

        //ENTONCES
        Assertions.assertFalse(juan.esMayorDeEdad(fechaHoy));
        Assertions.assertFalse(matias.esMayorDeEdad(fechaHoy));


    }

}
