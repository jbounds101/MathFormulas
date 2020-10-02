/**
 * Mathematical Functions
 *
 * @author Jackson Bounds
 * @version 10/02/2020
 */
public class Formulas {

    public static void quadraticFormula(double a, double b, double c) {
        double innerFunc = Math.pow(b, 2) - 4 * a * c;
        innerFunc = Math.sqrt(innerFunc);

        if (Double.isNaN(innerFunc)) System.out.println("Cannot compute");

        double firstNum = (-b + innerFunc) / (2 * a);
        double secondNum = (-b - innerFunc) / (2 * a);

        System.out.printf("First solution: %.2f\nSecond Solution: %.2f%n", firstNum, secondNum);

    }

    public static void main(String[] args) {
        quadraticFormula(1, 8, 15);
    }
}
