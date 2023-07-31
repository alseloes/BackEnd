package Cl2_TemplateMethod.Mesa2;

import Cl2_TemplateMethod.Mesa2.service.Cocinero;
import Cl2_TemplateMethod.Mesa2.service.impl.CocineroNoVeggie;
import Cl2_TemplateMethod.Mesa2.service.impl.CocineroVeggie;

public class Main {

    public static void main(String[] args) {
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        cocineroNoVeggie.hacerPizza();
    }
}
