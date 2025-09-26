import java.util.Scanner;

public class EvaluadorEdad {
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 System.out.println("Por favor ingrese su edad");
 int edad = scanner.nextInt();
 if (edad >=18 && edad < 65) {
    System.out.println("Usted esta en edad laboral");
 } if (edad < 18 || edad >=65) {
    System.out.println("Usted no está en edad laboral.");
 }
 scanner.close();}

}
