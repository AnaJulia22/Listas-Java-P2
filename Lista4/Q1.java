package Lista4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = lerNumeroPositivo(scanner, "Insira o primeiro número: ");
        int n2 = lerNumeroPositivo(scanner, "Insira o segundo número: ");

        String resultado = maior(n1, n2);
        System.out.println(resultado);

        scanner.close();
    }
    public static String maior(int n1, int n2) {
        if (n1 > n2) {
            return "O maior é: " + n1;
        } else if (n1 < n2) {
            return "O maior é: " + n2;
        } else {
            return "Os números são iguais";
        }
    }

    public static int lerNumeroPositivo(Scanner scanner, String mensagem) {
        int numero;
        while (true) {
            System.out.print(mensagem);
            try {
                numero = scanner.nextInt();

                if (numero > 0) {
                    break;
                } else {
                    System.out.println("Por favor, insira um número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }
        return numero;
    }

    /*(1) Faça o design de uma função "maior" que receba dois números [inteiros e positivos]
          e retorne o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".

            * Exemplo de execução – Exercício 1
    Caso de teste 1
    Insira o primeiro número:
            1
    Insira o segundo número:
            2
    O maior é: 2
            * Exemplo de execução – Exercício 1
    Caso de teste 2
    Insira o primeiro número:
            1
    Insira o segundo número:
            1
    Os números são iguais*/
}
