import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º Nº:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o 2º Nº:");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + calculadora.soma(num1, num2));
        System.out.println("Subtração: " + calculadora.subracao(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(num1, num2));
        System.out.println("Divisão: " + calculadora.divisao(num1, num2));


        scanner.close();

    }
}
