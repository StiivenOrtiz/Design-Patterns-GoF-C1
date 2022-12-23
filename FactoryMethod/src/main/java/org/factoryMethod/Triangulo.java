package org.factoryMethod;

public class Triangulo implements Forma{
    double a = 0, b = 0, c = 0;
    @Override
    public double perimetro() {
        return a+b+c;
    }

    @Override
    public void meterDatos(String datos) {
        String[] parts = datos.split(",");
        this.a = Double.parseDouble(parts[0]);
        this.b = Double.parseDouble(parts[1]);
        this.c = Double.parseDouble(parts[2]);
    }
}
