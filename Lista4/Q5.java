package Lista4;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o dado da posição " + (i + 1) + ": ");

            numeros[i] = scanner.nextDouble();
        }

        System.out.print("Insira a chave de busca: ");
        double chave = scanner.nextDouble();

        boolean numeroIgual = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == chave) {
                System.out.println("Chave encontrada na posição: " + (i + 1));
                numeroIgual = true;
                break;
            }
        }

        if (!numeroIgual) {
            System.out.println("Chave não encontrada!");
        }

        scanner.close();
    }

    /*(5) Desenvolva um algoritmo que preencha um vetor numérico de 5 posições. Após preencher todo o vetor,
          o usuário deve inserir uma chave de busca X. Caso exista algum número igual a X, dentro do vetor,
          o algoritmo deve mostrar, na tela, o índice da primeira posição na qual X foi encontrado. Caso contrário,
          o algoritmo deve se encerrar com uma única mensagem, dizendo "Chave não encontrada.".
          OBS: para essa questão nao é obrigatório usar uma função...

            * Exemplo de execução – Exercício 5
    Caso de teste 1
    Insira o dado da posição  1:
            11
    Insira o dado da posição  2:
            12
    Insira o dado da posição  3:
            13
    Insira o dado da posição  4:
            14
    Insira o dado da posição  5:
            15
    Insira a chave de busca:
            15
    Chave encontrada na posição:  5
            * Exemplo de execução – Exercício 5
    Caso de teste 2
    Insira o dado da posição  1:
            11
    Insira o dado da posição  2:
            12
    Insira o dado da posição  3:
            13
    Insira o dado da posição  4:
            14
    Insira o dado da posição  5:
            15
    Insira a chave de busca:
            20
    Chave não encontrada!*/
}
