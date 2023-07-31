package Cl2_TemplateMethod.Mesa2.service.impl;

import Cl2_TemplateMethod.Mesa2.service.Cocinero;

public class CocineroVeggie extends Cocinero {

    @Override
    protected void prepararIngredientes() {
            System.out.println("Preparando tomate y diferentes quesos");
        }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando quesos y tomate");
    }
}

