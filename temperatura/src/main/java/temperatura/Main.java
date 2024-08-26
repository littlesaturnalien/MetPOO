/*
Programa para Convertir Temperaturas de Celsius a Fahrenheit

Descripción: Escribe un programa en Java que convierta una temperatura de
grados Celsius a grados Fahrenheit.

Instrucciones:

Solicita al usuario que ingrese una temperatura en grados Celsius.
Aplica la fórmula de conversión: Fahrenheit = (Celsius * 9/5) + 32.
Muestra el resultado en la consola.
*/

package temperatura;

import models.Conversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        Scanner sc = new Scanner(System.in);
        int celsius, fahrenheit;

        System.out.print("Enter the temperature in degrees Celsius: ");
        celsius = Integer.parseInt(sc.nextLine());

        conversion.setCelsius(celsius);
        fahrenheit = conversion.celsiusToFahrenheit();

        System.out.println("Making the conversion...");
        System.out.println("\nThe temperature is " + fahrenheit + " degrees Fahrenheit.");
    }
}
