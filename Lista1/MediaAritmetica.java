package Lista1;
import java.util.Scanner;

public class MediaAritmetica {
    /*(2) Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

        * Exemplo de execução – Exercício 2 - Caso de teste
        Informe três notas, em sequência:
        5,5
        6,0
        6,5
        Média aritmética:  6*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, mediaAritmetica;

        System.out.println("Digite três números em sequência:");

        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3)/3;

        System.out.printf("Resultado: %.2f", mediaAritmetica);

        scanner.close();
    }
}
