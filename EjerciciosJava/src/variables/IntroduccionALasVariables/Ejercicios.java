package variables.IntroduccionALasVariables;

public class Ejercicios {
    public static void main(String[] args) {


    }

    public static void ejercicio1(){
        /* 1. Declaración simple: Declara una variable de tipo entero llamada
        edad y asígnale tu edad. */

        int edad = 24;
    }

    public static void ejercicio2(){
        /* 2. Declaración múltiple: Declara tres variables de tipo String:
        nombre, apellido y ciudad, en una sola línea.*/
        
        String nombre, apellido, ciudad;
    }

    public static void ejercicio3(){
        /* 3. Inicialización: Declara una variable de tipo double llamada precio
         e inicialízala con el valor 19.99*/

        double precio = 19.99;
    }

    public static void ejercicio4(){
        /* 4. Constantes: Declara una constante de tipo int llamada DIAS_SEMANA
        con el valor 7.*/

        int DIAS_SEMANA = 7;
    }

    public static void ejercicio5(){
        /* 5. Tipos mixtos: Declara una variable nombreCompleto concatenando variables
        nombre y apellido.*/

        String nombre = "Rodolfo", apellido = "Leija";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
    }

    public static void ejercicio6(){
        /* 6. Ejercicio de conversión implícita: Declara un int y asígnale un valor.
         Luego, asígnale ese valor a un double. Imprime ambos valores. */

        int valor1 = 10;
        double valor2 = valor1;
        System.out.println(valor1 + " // " + valor2);
    }

    public static void ejercicio7(){
        /* 7. Ejercicio de conversión explícita (casting): Declara un double con
        un valor decimal. Luego, conviértelo a un int e imprime el resultado.*/

        double valor1 = 23.3;
        int valorDecimal = (int)valor1;
        System.out.println(valor1 + " // " + valorDecimal);
    }

    public static void ejercicio8(){
        /* 8. Ámbito de variables: Declara una variable dentro de un bloque
        if e intenta acceder a ella fuera del bloque. ¿Qué ocurre?*/

        if (true){
            int valorIf = 5;
        }
        //System.out.println(valorIf); // Dará un error, pues la variable no funciona fuera
        // del bloque.
    }

    /* Ejercicio 9 está separado en dos clases*/


}