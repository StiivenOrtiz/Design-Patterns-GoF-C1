package org.factoryMethod;

public class Triangulo implements Forma{
    double a = 0, b = 0, c = 0;
    @Override
    public double perimetro() {
        return a+b+c;
    }

    public Triangulo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setC(double c) {
        this.c = c;
    }
}
