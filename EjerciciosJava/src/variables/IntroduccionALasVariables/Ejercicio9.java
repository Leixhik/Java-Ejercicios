package variables.IntroduccionALasVariables;

public class Ejercicio9 {
    /* 9. Variables estáticas: Crea una clase con una variable estática que
    el número de objetos creados de esa clase.*/

    public static void main(String[] args) {

        // Crear algunos objetos como ejemplo (3)
        new ConteoObjetos();
        new ConteoObjetos();
        new ConteoObjetos();

        // Impresión de objetos en consola
        System.out.println("Número de objetos creados: " + ConteoObjetos.getContador());
    }
    //Para este ejercicio requerí de usar AI, debido a que no entendía la forma de imprimir clases.
    /* Además, entendí que para crear algo static, lo cuál es una variable que pertenece a la clase y
    * no a un objeto específico, es necesario dividir los archivos, ya que static choca con el main,
    * si se crea una clase diferente en la misma instancia (Vaya, es necesario compilar separado)d.*/
}
