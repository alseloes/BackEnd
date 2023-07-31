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
        Assertions.assertEquals("Alvarez, Juan Carlos", juan.mostrarNombreCompleto() );
        Assertions.assertEquals("Alvarez, Matias", matias.mostrarNombreCompleto());
    }

    @Test
    public void testEsMayorDeEdad () {
        //DADO
        LocalDate fechaHoy = LocalDate.of(2021, 9, 21);
        //CUANDO

        //ENTONCES
        Persona persona1 = new Persona("Pedro", "Gomez", "pedro@example.com", 6);
        Assertions.assertFalse(persona1.esMayorDeEdad(fechaHoy));

        Persona persona2 = new Persona("Ana", "Lopez", "ana@example.com", 19);
        Assertions.assertFalse(persona2.esMayorDeEdad(fechaHoy));



    }

}
