package Lista3;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        System.out.println("Insira o valor de A:");
        A = scanner.nextInt();

        System.out.println("Insira o valor de B:");
        B = scanner.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                System.out.println("É impar: " + i);
            }
        }

        /*
        Solução usando continue:

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("É impar: " + i);
        }*/
        scanner.close();
    }
    /*(4) Desenvolva um algoritmo que peça ao usuário que insira dois números inteiros positivos A e B, no qual A deve ser
          menor que B (supõe-se que o usuário irá respeitar esse enunciado). O algoritmo deve mostrar, na tela, todos os números
          ímpares compreendidos entre A e B (inclusive).

          * Exemplo de execução – Exercício 4 - Caso de teste
            Insira o valor de A:
                    1
            Insira o valor de B:
                    10
            É impar: 1
            É impar: 3
            É impar: 5
            É impar: 7
            É impar: 9*/
}
