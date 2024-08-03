package Lista3;
import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = scanner.nextInt();

        boolean primo = true;

        if(num<=1)
        {
            primo = false;
        } else {
            for(int i=2;i<=num/2;i++)
            {
                if((num%i)==0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.printf("%d é primo", num);
        } else {
            System.out.printf("%d não é primo", num);
        }
        scanner.close();
    }
    /*(5) Desenvolva um algoritmo que receba um número N e informe se N é um número primo, ou não. A saber: um número primo
          é um inteiro positivo que só pode ser dividido por ele mesmo e por um, apenas.

          *Exemplo de execução – Exercício 5 - Caso de teste 1
            Insira um número:
                    7
                    7 é primo.

                    *Exemplo de execução – Exercício 5 - Caso de teste 2
            Insira um número:
                    10
                    10 não é primo.*/
}
