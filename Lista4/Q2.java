package Lista4;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        String resultado = isFirstGreater(numeros);
        System.out.println(resultado);

        scanner.close();

    }

    public static String isFirstGreater(double[] numeros) {
        if (numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
            return "Condição satisfeita";
        } else {
            return "Erro";
        }
    }

    /*(2) Faça o design de uma função "isFirstGreater" que receba três números. No final o programa deve imprimir
          "Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os outros dois
          (o primeiro não pode ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro".
          OBS: use vetor/array de 3 posicoes para armazenar os numeros lidos.
            *Exemplo de execução – Exercício 2
    Caso de teste 1
    Insira o primeiro número:
            3
    Insira o segundo número:
            2
    Insira o terceiro número:
            1
    Condição satisfeita
*Exemplo de execução – Exercício 2
    Caso de teste 2
    Insira o primeiro número:
            2
    Insira o segundo número:
            3
    Insira o terceiro número:
            1
    Erro
*Exemplo de execução – Exercício 2
    Caso de teste 3
    Insira o primeiro número:
            2
    Insira o segundo número:
            2
    Insira o terceiro número:
            1
    Erro*/
}
