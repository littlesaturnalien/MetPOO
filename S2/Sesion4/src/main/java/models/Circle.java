/*
Ejercicio1.
Crear una clase llamada Cuenta que tendrá los siguientes atributos: titular y
cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. Crea dos constructores
que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

-ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
introducida es negativa, no se hará nada.
-retirar(double cantidad): se retira una cantidad a la cuenta, si restando la
cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
*/

/*
Ejercicio 2.

Crear una clase llamada Serie con las siguientes características:

Sus atributos son titulo, numero de temporadas, entregado, genero y creador.

Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de
atributos serán valores por defecto según el tipo del atributo.

Los constructores que se implementaran serán:

Un constructor por defecto.
Un constructor con el titulo y creador. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:

Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
*/

package models;

public class Circle {

    private double radius;
    private double circumference;
    private double area;

    public Circle() {
    }

    public Circle(double radius, double circumference, double area) {
        this.radius = radius;
        this.circumference = circumference;
        this.area = area;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
