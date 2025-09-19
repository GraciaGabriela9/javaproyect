import java.util.Scanner;

public class EvaluadorEdad {
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.println("Por favor ingrese su edad");
 int edad = scanner.nextInt();
 if (edad >=18) {
    System.out.println("Eres mayor de edad");
 } else {
    System.out.println("Eres menor de edad");
 }
 scanner.close();}

}
