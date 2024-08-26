/* Programa para Determinar si un Número es Par o Impar

Descripción: Crea un programa en Java que determine si un número introducido por
el usuario es par o impar.

Instrucciones:

1. Solicita al usuario que ingrese un número entero.
2. Utiliza una estructura condicional (if-else) para verificar si el número es par o impar.
3. Muestra el resultado en la consola.*/

package evalNum;

import models.Evaluate;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Evaluate eval = new Evaluate();
        Scanner sc = new Scanner(System.in);
        int num;
        String result;

        System.out.print("Add an integer: ");
        num = Integer.parseInt(sc.nextLine());

        eval.setNum(num);
        result = eval.evalEvenOrOddNum();

        System.out.println(result);
    }
}
