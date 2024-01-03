import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("CalculadoraSencilla");
        double num1;
        double num2;
        char operacion;

        try {
            System.out.println("Ingrese el primer número: ");
            num1 = input.nextDouble();

            System.out.println("Ingrese el segundo número: ");
            num2 = input.nextDouble();
        } catch (InputMismatchException e) {
            throw new RuntimeException("Debe ingresar números válidos");
        }

        System.out.println("Seleccione una operación (+,-,*,/): ");
        operacion = input.next().charAt(0);

        CalculadoraSencilla calculadora = new CalculadoraSencilla();

        double resultado = calculadora.realizarOperacion(num1, num2, operacion);

        System.out.println("El resultado es: " + resultado);

    }
}
