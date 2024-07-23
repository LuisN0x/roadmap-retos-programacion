/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

public class LuisN0x {
    /*
    * 1) Lenguaje seleccionado: https://www.java.com/es/
    * comentario de varias
    * lineas
     */

    // 2) Variable y constante
    Integer variable;
    static final Integer constante = 8;

    // 3) variables de primitivas
    int numero = 1;
    char caracter = 'A';
    boolean boleano = true;
    long numeroLargo = 999999999999L;
    double numeroLargoConDecimales = 12.34;
    float numeroConDecimales = 56.31f;
    char[] string = {'S','T','R','I','N','G'};

    public static void main(String[] args) {
        // 4) Imprimir por terminal
        System.out.println("¡Hola, Java!");
    }
}
