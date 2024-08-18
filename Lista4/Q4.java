package Lista4;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o dado da posição " + (i + 1) + ": ");

            numeros[i] = scanner.nextDouble();
        }

        double[] resultado = dividir100(numeros);

        System.out.println("Conteúdo dividido por 100:");
        for (double valor : resultado) {
            System.out.println(valor);
        }

        scanner.close();
    }

    public static double[] dividir100(double[] numeros) {
        double[] resultado = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = numeros[i] / 100;
        }
        return resultado;
    }

    /*(4) Desenvolva um algoritmo que peça ao usuário que preencha os dados de um vetor de 5 posições com valores reais
    quaisquer, desde que estejam compreendidos entre 1 e 100 (suponha que o usuário irá respeitar o enunciado). Depois,
    faça o design de uma função "dividir100" que divide o conteúdo de cada posição do vetor por 100. Ao final, o programa
    deve mostrar, na tela, o conteúdo de cada posição do vetor, dividido por 100.
            * Exemplo de execução – Exercício 4
    Caso de teste
    Insira o dado da posição  1:
            10
    Insira o dado da posição  2:
            20
    Insira o dado da posição  3:
            30
    Insira o dado da posição  4:
            40
    Insira o dado da posição  5:
            50
    Conteúdo dividido por 100:
            0.1
            0.2
            0.3
            0.4
            0.5*/

}
