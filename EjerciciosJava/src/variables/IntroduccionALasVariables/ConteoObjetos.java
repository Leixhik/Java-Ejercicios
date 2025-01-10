package variables.IntroduccionALasVariables;

public class ConteoObjetos{

    /* Parte del ejercicio 9 */

    // Variable estática para contar los objetos
    private static int contador = 0;

    // Constructor de la clase
    public ConteoObjetos(){
        contador++; // Incrementar el contador cada vez que crea un objeto
    }

    // Método estático para obtener el número de objetos creados
    public static int getContador(){
        return contador;
    }
}
