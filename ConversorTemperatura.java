import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);


        System.out.println("Esolha o tipo de conversão.");
        System.out.println("1: Celsius para Fahrenheit.");
        System.out.println("2: Fahrenheit para Celsius.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            celsiusFahrenheit();
        } else if (escolha == 2) {
            fahrenheitCelsius();
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    public static void celsiusFahrenheit () {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("\nInforme a temperatura em Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("\n" + celsius + "C convertido é igual a: " + fahrenheit + "F\n");

        scanner.close();
    }

    public static void fahrenheitCelsius () {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("\nInforme a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("\n" + fahrenheit + "F convertido é igual a: " + celsius + "C\n");

        scanner.close();
    }
}