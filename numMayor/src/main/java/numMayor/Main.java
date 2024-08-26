/*
Programa para Encontrar el Mayor de Tres Números
Descripción: Desarrolla un programa en Java que determine cuál es el mayor
de tres números ingresados por el usuario.

Instrucciones:

Solicita al usuario que ingrese tres números enteros.
Utiliza estructuras condicionales (if-else) para comparar los tres números.
Muestra el mayor número en la consola.
*/

package numMayor;

import models.Evaluate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Evaluate eval = new Evaluate();
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, largest;

        System.out.println("Add three numbers: ");

        System.out.print("First number: ");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Second number: ");
        num2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Third number: ");
        num3 = Integer.parseInt(scanner.nextLine());

        eval.setNum1(num1);
        eval.setNum2(num2);
        eval.setNum3(num3);

        largest = eval.getLargestNumber();

        if (largest == eval.getNum1() || largest == eval.getNum2() || largest == eval.getNum3()) {
            System.out.println(largest + " is the largest number.");
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}
