import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calculadora de un solo uso");
        System.out.println("-------------------------");

        System.out.println("Ingresa el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicaion = numero1 * numero2;
        double division = (double) numero1 / numero2;

        int modulo = numero1 % numero2;
        System.out.println("\nElije una operación:");
        System.out.println("1. Suma (+) " + suma);
        System.out.println("2. Resta (-) " + resta);
        System.out.println("3. Multiplicación (*) " + multiplicaion);
        System.out.println("4. División (/) " + division);
        System.out.println("5. Módulo (%)" + modulo);


        System.out.print("Tu opción");
        int opcion = scanner.nextInt();
        if (opcion == 1) { // Usa el operador de comparación '=='
            int resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (opcion == 2) {
            int resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (opcion == 3) {
            int resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (opcion == 4) {
            // Usa una condición 'if' para evitar la división por cero
            if (numero2
                    != 0) { // Usa el operador de comparación '!='
                double resultado = (double) numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }
        } else if (opcion == 5) {
            int resultado = numero1 % numero2;
            System.out.println("El resultado del módulo es: " + resultado);
        } else {
            System.out.println("Opción inválida. Por favor, elige un número del 1 al 5.");
        }

        scanner.close();


    }

}