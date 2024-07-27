import java.util.Scanner;
public class Soma {
    /*(1) Faça um programa que receba quatro
        números inteiros, calcule e mostre a soma desses números.

        * Exemplo de execução – Exercício 1 - Caso de teste
        Informe quatro números, em sequência:
        1
        2
        3
        4
        Resultado da soma:  10*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4, soma;

        System.out.println("Digite quatro números em sequência:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();

        soma = n1 + n2 + n3 + n4;

        System.out.println("Resultado: " + soma);

        scanner.close();
    }
}
