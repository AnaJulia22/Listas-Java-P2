package Lista2;
import java.util.Scanner;

public class MaiorNumero {
    // 1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite o primeiro numero:");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        n2 = scanner.nextDouble();

        if (n1 > n2) {
            System.out.println("O maior e: " + n1);
        } else if (n1 < n2) {
            System.out.println("O maior e: " + n2);
        } else {
            System.out.println("Os numeros sao iguais");
        }

        scanner.close();
    }

    /*(1) Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais,
          deve-se mostrar a mensagem "Os números são iguais".

          * Exemplo de execução – Exercício 1 - Caso de teste 1
            Insira o primeiro número:
                    1
            Insira o segundo número:
                    2
            O maior é: 2

          * Exemplo de execução – Exercício 1 - Caso de teste 2
            Insira o primeiro número:
                    1
            Insira o segundo número:
                    1
            Os números são iguais*/
}
