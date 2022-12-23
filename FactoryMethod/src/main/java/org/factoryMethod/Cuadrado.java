package org.factoryMethod;

public class Cuadrado implements Forma{
    double a = 0, b = 0;
    @Override
    public double perimetro() {
        return (a*2) + (b*2);
    }

    @Override
    public void meterDatos(String datos) {
        String[] parts = datos.split(",");
        this.a = Double.parseDouble(parts[0]);
        this.b = Double.parseDouble(parts[1]);
    }
}

