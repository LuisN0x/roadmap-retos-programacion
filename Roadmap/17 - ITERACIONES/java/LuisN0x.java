/*
 * EJERCICIO:
 * Utilizando tu lenguaje, emplea 3 mecanismos diferentes para imprimir
 * números del 1 al 10 mediante iteración.
 *
 * DIFICULTAD EXTRA (opcional):
 * Escribe el mayor número de mecanismos que posea tu lenguaje
 * para iterar valores. ¿Eres capaz de utilizar 5? ¿Y 10?
 */
public class LuisN0x {

    public static void main(String[] args) {
        /*Utilizando iteradores nativos for, while, do-while*/
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1)+ ",");
        }

        int j = 0;
        while(j < 10) {
            System.out.print((j + 1) + ",");
            j++;
        }

        int k = 0;
        do {
            k++;
            System.out.print(k + ",");
        } while(k <= 10);

        /*Utilizando una función recursiva*/
        imprimirNumeros(1,10);
    }

    static void imprimirNumeros(int inicio, int fin) {
        if(inicio <= fin) {
            System.out.print(inicio + ",");
            imprimirNumeros(inicio + 1, fin);
        }
    }
}
