/*
Programa para calcular el area de un  circulo.

Descripción: Desarrolla un programa en Java que permita leer el radio
de un circulo y calcule el area de dicho circulo utilizando la formula:
area = pi (radio  radio)

Instrucciones:

Leer el radio del circulo
Aplicar formula
Mostrar en pantalla el area del circulo.
*/

package areaCirculo;

import models.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        double radius, area;

        System.out.print("Enter radius of the circle: ");
        radius = Double.parseDouble(sc.nextLine());

        circle.setRadius(radius);
        area = circle.getArea();

        System.out.println("Area of the circle: " + String.format("%.2f", area));
    }
}
