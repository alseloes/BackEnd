package Cl1_JUnit.Mesa1;
//Ejecuto en ambas clases el metodo implements @override para la clase abstracta
//Declaramos la varibale cuadrado y radio en circulo
//obtenemos el contructor, getter y setter
public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String calcularArea() {
        //Realizado el override anterior, calculamos ahora la circunsferencia del circulo.
        //A partir de este momento puedo implementar el test, recordando crear la clase test e importando libreria
        if (radio > 0) {
            return "el area del circulo es " + Math.PI * Math.pow(radio, 2)+ " unidades";
        }
        else {
            return "No se puede calcular un 0 o negativo";
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
