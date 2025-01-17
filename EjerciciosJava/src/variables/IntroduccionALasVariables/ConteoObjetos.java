package variables.IntroduccionALasVariables;

public class ConteoObjetos{

    /* Parte del ejercicio 9
    *  Esta clase cuenta el número de objetos creados.
    *  */

    // Variable estática para contar los objetos
    private static int contador = 0;

    // Constructor de la clase. Se ejecuta cada vez que se crea un nuevo objeto.
    public ConteoObjetos(){
        contador++; // Incrementar el contador +1 cada vez que crea un objeto
    }

    // Metodo estático para obtener el número de objetos creados
    public static int getContador(){
        return contador;
    }
}
