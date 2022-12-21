package org.singleton;

public class Main {
    public static void main(String[] args) {
        /* Ahora haremos uso del patrón Singleton, poniendo principalmente a prueba de que no podemos instanciar
        el objeto por medio de new.*/
        //Singleton s = new Singleton(); // Como podemos no lo permite, por ser un constructor privado.
        Singleton s = Singleton.getInstancia(); // Con el método que hicimos funciona correctamente.
        // Prueba de comandos.
        s.metodo1();
        s.metodo2();
    }
}