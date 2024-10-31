import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora básica");
        
        // Pide al usuario que ingrese dos números
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Pide al usuario que elija una operación
        System.out.println("Elige una operación: (+, -, *, /)");
        char operador = scanner.next().charAt(0);
        
        double resultado;
        
        // Realiza la operación según el operador seleccionado
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
        scanner.close();
    }
}
