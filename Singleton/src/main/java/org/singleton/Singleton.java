package org.singleton;

public class Singleton {
    // Declaración
    private static Singleton instancia;

    /* Para poder utilizar Singleton necesitamos que no se puedan crear más instancias y la única forma de restringir
    esta acción es definiendo el constructor en privado. */
    private Singleton(){

    }

    /* Ahora, como hemos adaptado el constructor de manera privada, para el uso del mismo requerimos que se pueda
    obtener la instancia que anteriormente fue creada, o en su defecto al no ser creada antes, una manera de crearla. */
    public static Singleton getInstancia(){
        if(instancia==null)
        {
            instancia = new Singleton();
        }

        return  instancia;
    }

    /* Hasta el momeento ya hemos aplicado por completo el método Singleton, pero para realizar la prueba añadiremos
    métodos con los cuales pondremos a prueba el funcionamiento del patrón. */
    public void metodo1(){
        System.out.println("Metodo 1.");
    }

    public void metodo2(){
        System.out.println("Metodo 2.");
    }

}
