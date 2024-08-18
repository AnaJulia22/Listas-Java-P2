package Lista4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");

        int numero;

        while (true) {
            try {
                numero = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        String resultado = parImpar(numero);
        System.out.println(resultado);

        scanner.close();
    }

    public static String parImpar(int numero) {
        if (numero % 2 == 0) {
            return numero + " é par";
        } else {
            return numero + " é ímpar";
        }
    }
    /*(3) Faça o design de uma função "parImpar" que receba um número inteiro e verifique se esse número é par ou ímpar.
            *Exemplo de execução – Exercício 3
    Caso de teste 1
    Insira um número:
            2
            2 é par.
            *Exemplo de execução – Exercício 3
    Caso de teste 2
    Insira um número:
            3
            3 é impar.*/
}
