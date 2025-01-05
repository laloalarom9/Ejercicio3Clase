import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de la clase Main");
        menu();

    }

    public static void menu() {
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opción: ");

        int option = 0;
        try {
            option = Integer.parseInt(scanner.nextLine());
            //option = Integer.parseInt(System.console().readLine());
            switch(option) {
                case 1:
                    System.out.println("Seleccionó sumar");
                    System.out.println("Ingrese el primer número: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    System.out.println("El resultado de la suma es: " + operations.sum(a, b));
                    menu();
                    break;
                case 2:
                    System.out.println("Seleccionó restar");
                    System.out.println("Ingrese el primer número: ");
                    int c = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int d = Integer.parseInt(scanner.nextLine());
                    System.out.println("El resultado de la resta es: " + operations.subtract(c, d));
                    menu();
                    break;
                case 3:
                    System.out.println("Seleccionó multiplicar");
                    break;
                case 4:
                    System.out.println("Seleccionó dividir");
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    menu();
            }


        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido");
            menu();
        }
    }
}