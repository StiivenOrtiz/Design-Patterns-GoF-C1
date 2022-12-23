package org.factoryMethod;

public class Cuadrado implements Forma{
    double a = 0, b = 0;
    @Override
    public double perimetro() {
        return (a*2) + (b*2);
    }

    public Cuadrado(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
