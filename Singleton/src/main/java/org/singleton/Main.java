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

        // Ahora vamos con otro ejemplo, en el cual utilizaremos otra clase en la que implementaremos singleton.
        //Declaramos datosPersonales1 para obtener o crear la instancia.
        DatosPersonales datosPersonales1 = DatosPersonales.getInstancia();

        // Imprimimos los datos que se encuentran dentro de la clase, en este caso todo será nulo porque no se le han dado valores.
        System.out.println("\nNombre: " + datosPersonales1.getNombre() + "\nApellido1: " + datosPersonales1.getApellido1() + "\nApellido2: " + datosPersonales1.getApellido2());

        // Procedemos a ingresar datos.
        datosPersonales1.setNombre("Stiven");
        datosPersonales1.setApellido1("Ortiz");

        // Los imprimimos para verificar que si haya sido posible ingresar estos datos.
        System.out.println("\nNombre: " + datosPersonales1.getNombre() + "\nApellido1: " + datosPersonales1.getApellido1() + "\nApellido2: " + datosPersonales1.getApellido2());

        // Declaramos otro objeto y obtenemos los datos.
        DatosPersonales datosPersonales2 = DatosPersonales.getInstancia();

        // Verificamos que no estamos haciendo uso otro espacio de memoria.
        System.out.println("\nNombre: " + datosPersonales2.getNombre() + "\nApellido1: " + datosPersonales2.getApellido1() + "\nApellido2: " + datosPersonales2.getApellido2());

        datosPersonales2.setApellido2("@st1ven11");

        System.out.println("\nNombre: " + datosPersonales1.getNombre() + "\nApellido1: " + datosPersonales1.getApellido1() + "\nApellido2: " + datosPersonales1.getApellido2());
    }
}