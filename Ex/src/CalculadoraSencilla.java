public class CalculadoraSencilla {

    public double realizarOperacion(double num1, double num2, char operacion) {

        double resultado = 0.0;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
        }

        return resultado;
    }
}
