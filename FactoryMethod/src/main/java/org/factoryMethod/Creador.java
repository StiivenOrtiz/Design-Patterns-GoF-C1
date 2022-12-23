package org.factoryMethod;

public class Creador {
    public Forma getForma(String nombre){
        if(nombre == null)
            return new FormaDesconocida();
        else if(nombre.equalsIgnoreCase("cuadrado"))
            return new Cuadrado();
        else if(nombre.equalsIgnoreCase("triangulo"))
            return new Triangulo();
        return new FormaDesconocida();
    }
}

