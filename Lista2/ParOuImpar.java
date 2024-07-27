package Lista2;
import java.util.Scanner;

public class ParOuImpar {
    /*(3) Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.

        *Exemplo de execução – Exercício 3 - Caso de teste 1
            Insira um número:
                    2
                    2 é par.

        *Exemplo de execução – Exercício 3 - Caso de teste 2
            Insira um número:
                    3
                    3 é impar.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Digite um numero inteiro:");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " e par.");
        } else {
            System.out.println(n + " e impar.");
        }

        scanner.close();
    }
}
