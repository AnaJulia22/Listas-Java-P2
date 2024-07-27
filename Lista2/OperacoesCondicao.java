package Lista2;
import java.util.Scanner;

public class OperacoesCondicao {
    // 4)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite o primeiro numero:");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        n2 = scanner.nextDouble();

        if (n1 > n2) {
            double subtracao = n1 - n2;
            System.out.println("Subtracao: " + subtracao);
        } else if (n1 < n2) {
            double soma = n1 + n2;
            System.out.println("Soma: " + soma);
        } else {
            double multiplicacao = n1 * n2;
            System.out.println("Multiplicacao: " + multiplicacao);
        }

        scanner.close();
    }
    /*(4) Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação entre eles,
          se ambos forem iguais. Caso o primeiro seja maior que o segundo, mostre a subtração do primeiro
          pelo segundo. Caso contrário, mostre a soma entre os dois.

        * Exemplo de execução – Exercício 4 - Caso de teste 1
              Insira o primeiro valor:
                      2
              Insira o segundo valor:
                      2
              Multiplicação:  4

        * Exemplo de execução – Exercício 4 - Caso de teste 2
              Insira o primeiro valor:
                      2
              Insira o segundo valor:
                      1
              Subtração:  1

        * Exemplo de execução – Exercício 4 - Caso de teste 3
              Insira o primeiro valor:
                      1
              Insira o segundo valor:
                      2
              Soma:  3*/
}
