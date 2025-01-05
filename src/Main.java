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
        System.out.println("5. Elevar al cuadrado");
        System.out.println("6. Salir");
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
                    System.out.println("Ingrese el primer número: ");
                    int e = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int f = Integer.parseInt(scanner.nextLine());
                    System.out.println("El resultado de la multiplicación es: " + operations.multiply(e, f));
                    menu();
                    break;
                case 4:
                    System.out.println("Seleccionó dividir");
                    System.out.println("Ingrese el primer número: ");
                    int g = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int h = Integer.parseInt(scanner.nextLine());
                    System.out.println("El resultado de la división es: " + operations.divide(g, h));
                    menu();
                    break;
                case 5:
                    System.out.println("Seleccionó elevado al cuadrado");
                    System.out.println("Ingrese el número: ");
                    int i = Integer.parseInt(scanner.nextLine());
                    System.out.println("El resultado de elevar al cuadrado es: " + operations.cuadrado(i));
                    menu();
                case 6:
                    System.out.println("Adiós bro");
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