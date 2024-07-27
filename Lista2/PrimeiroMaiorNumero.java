package Lista2;
import java.util.Scanner;

public class PrimeiroMaiorNumero {
    // 2)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Digite o primeiro numero:");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        n2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero:");
        n3 = scanner.nextDouble();

        if (n1 > n2 && n1 > n3 && n1 != n2 && n1 != n3) {
            System.out.println("Condicao satisfeita");
        } else {
            System.out.println("Erro");
        }

        scanner.close();
    }

    /*(2) Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir "Condição satisfeita", na tela,
          caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum).
          Caso contrário, deve ser impressa a mensagem: "Erro".

        *Exemplo de execução – Exercício 2 - Caso de teste 1
            Insira o primeiro número:
                    3
            Insira o segundo número:
                    2
            Insira o terceiro número:
                    1
            Condição satisfeita
        *Exemplo de execução – Exercício 2 - Caso de teste 2
            Insira o primeiro número:
                    2
            Insira o segundo número:
                    3
            Insira o terceiro número:
                    1
            Erro

        *Exemplo de execução – Exercício 2 - Caso de teste 3
            Insira o primeiro número:
                    2
            Insira o segundo número:
                    2
            Insira o terceiro número:
                    1
            Erro*/
}
