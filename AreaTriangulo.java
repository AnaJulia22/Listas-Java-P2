import java.util.Scanner;
public class AreaTriangulo {
    /*(4) Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base * altura)/2.

        * Exemplo de execução – Exercício 4 - Caso de teste
        Insira a base:
        4
        Insira a altura:
        10
        Area do triangulo:  20*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite a base do seu triangulo:");
        base = scanner.nextDouble();
        System.out.println("Digite a altura do seu triangulo:");
        altura = scanner.nextDouble();

        area = (base * altura)/2;

        System.out.printf("Resultado: %.2f", area);

        scanner.close();


    }
}
