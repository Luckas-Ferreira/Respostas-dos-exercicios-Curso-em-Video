/*
 * EXERCÍCIO 005: Antecessor e Sucessor
 * Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor.
 */
import java.util.Scanner;
 public class Exercicio005 {
    public static void main(String[] args) {
        int num, antecessor, sucessor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        teclado.close();
        antecessor = num - 1;
        sucessor = num+ 1;
        System.out.printf("Você digitou o número : %d \nSeu antecessor é o %d e seu sucessor é o %d",num, antecessor, sucessor);
    }
}
