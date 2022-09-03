/*
 * EXERCÍCIO 007: Média Aritmética
 * Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
 */
import java.util.Scanner;

 public class Exercicio007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, media;
        System.out.print("Primeira nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        nota2 = teclado.nextFloat();
        teclado.close();

        media = (nota1 + nota2) / 2;
        System.out.printf("A média entre as duas notas é: %.2f", media);
    }
}
