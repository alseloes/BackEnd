package Cl1_JUnit.Mesa1;

public interface Figura {
    /*Si se hace con double despues debería ser vonvertido para poder mostrarlo, por eso uso String
     * Para la prueba es mejor, sino debería hacerse solo con el area*/
    /*La interfaz debe tener un metodo para calcular el area que permita que las demás clases
     puedan inplementar la función */

    String calcularArea();

    /*A partir de esto puedo crear las clases Circulo y Cuadrado,
     ambas clases van a tener implements como elemento para ejecutar la interfaz*/
}
