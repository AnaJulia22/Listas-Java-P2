package Lista1;
import java.util.Scanner;
import java.lang.Math;

public class Potencia {
    /*(5) Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.
        Dica: use import java.lang.Math; com a função pow

        * Exemplo de execução – Exercício 5 - Caso de teste
        Insira o primeiro número:
        2
        Insira o segundo número:
        3
        Resultado: 8*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = 0, n2 = 0, potencia;

        do {
            System.out.println("Digite o primeiro numero maior que 0:");
            n1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero maior que 0:");
            n2 = scanner.nextDouble();
            if (n1 <= 0) {
                System.out.println("O primeiro número inserido é inválido. O número deve ser maior que zero.");
            } else if (n2 <= 0) {
                System.out.println("O segundo número inserido é inválido. O número deve ser maior que zero.");
            }
        }
        while(n1 <= 0 || n2 <= 0 );

        potencia = Math.pow(n1, n2);

        System.out.printf("Resultado: %.2f", potencia);

        scanner.close();
    }
}
