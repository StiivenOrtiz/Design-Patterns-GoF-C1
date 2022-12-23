package org.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Creador creador = new Creador();

        Forma forma1 = creador.getForma("cuadrado");
        forma1.meterDatos("2.3,3.2");
        System.out.println(forma1.perimetro());

        Forma forma2 = creador.getForma("triangulo");
        forma2.meterDatos("2.3,3.2,4.2");
        System.out.println(forma2.perimetro());
    }
}