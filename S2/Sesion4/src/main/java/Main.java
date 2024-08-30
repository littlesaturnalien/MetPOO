import models.Calculator;
import models.Circle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome");
        double radius;
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle"));
        Circle circle = new Circle(radius);
        Calculator calc = new Calculator();
        JOptionPane.showMessageDialog(null, String.format("The area of the circle is " +
                "%.2f", calc.calculateArea(circle)));
    }
}
