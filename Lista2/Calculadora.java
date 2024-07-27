package Lista2;
import java.util.Scanner;

public class Calculadora {
    // 5)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha, n1 = 0, n2 = 0;

        do {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1. Digite 1 para somar");
            System.out.println("2. Digite 2 para subtrair");
            System.out.println("3. Digite 3 para multiplicar");
            System.out.println("4. Digite 4 para dividir");
            System.out.println("0. Sair");
            escolha = scanner.nextInt();
            if (escolha != 0) {
                System.out.println("Digite o primeiro numero:");
                n1 = scanner.nextInt();

                System.out.println("Digite o segundo numero:");
                n2 = scanner.nextInt();
            }

            switch(escolha) {
                case 1:
                    int soma = n1 + n2;
                    System.out.println("Soma: " + soma);
                    break;
                case 2:
                    int subtracao = n1 - n2;
                    System.out.println("Subtracao: " + subtracao);
                    break;
                case 3:
                    int multiplicacao = n1 * n2;
                    System.out.println("Multiplicacao: " + multiplicacao);
                    break;
                case 4:
                    if (n2 != 0) {
                        int divisao = n1 / n2;
                        System.out.println("Divisao: " + divisao);
                    } else {
                        System.out.println("Divisao por zero.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }

    /*(5) Desenvolva um algoritmo que simule uma calculadora. Você deve dar a opção de o usuário escolher entre:
          1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir. O usuário só conseguirá processar dois números
          inteiros por vez.

          * Exemplo de execução – Exercício 5 - Caso de teste 1
                Digite 1 para somar;
                Digite 2 para subtrair;
                Digite 3 para multiplicar;
                Digite 4 para dividir;
                        1
                Insira o primeiro valor:
                        1
                Insira o segundo valor:
                        2
                Soma: 3

          * Exemplo de execução – Exercício 5 - Caso de teste 2
                Digite 1 para somar;
                Digite 2 para subtrair;
                Digite 3 para multiplicar;
                Digite 4 para dividir;
                        2
                Insira o primeiro valor:
                        2
                Insira o segundo valor:
                        1
                Subtração: 1

          * Exemplo de execução – Exercício 5 - Caso de teste 3
                Digite 1 para somar;
                Digite 2 para subtrair;
                Digite 3 para multiplicar;
                Digite 4 para dividir;
                        3
                Insira o primeiro valor:
                        2
                Insira o segundo valor:
                        2
                Multiplicação: 4

          * Exemplo de execução – Exercício 5 - Caso de teste 4
                Digite 1 para somar;
                Digite 2 para subtrair;
                Digite 3 para multiplicar;
                Digite 4 para dividir;
                        4
                Insira o primeiro valor:
                        4
                Insira o segundo valor:
                        2
                Divisão: 2

          * Exemplo de execução – Exercício 5 - Caso de teste 5
                Digite 1 para somar;
                Digite 2 para subtrair;
                Digite 3 para multiplicar;
                Digite 4 para dividir;
                        4
                Insira o primeiro valor:
                        1
                Insira o segundo valor:
                        0
                Divisão por zero.*/
}
