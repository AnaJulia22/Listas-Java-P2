import java.util.Scanner;
public class AumentoSalarial {
    /*(3) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se
              que este sofreu um aumento de 25%.

        * Exemplo de execução – Exercício 3 - Caso de teste
        Insira o salário:
        1000
        Novo salário:  1250*/

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario, aumento;

        System.out.println("Digite seu salario:");

        salario = scanner.nextDouble();

        aumento = salario * 1.25;

        System.out.printf("Resultado: %.2f", aumento);

        scanner.close();

    }
}