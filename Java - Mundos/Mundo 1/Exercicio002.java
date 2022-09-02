/*
 * EXERCÍCIO 002: Respondendo ao Usuário
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.
 */
import java.util.Scanner;
 public class Exercicio002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = teclado.nextLine();
        teclado.close();

        System.out.print("É um prazer te conhecer " + nome);
    }
}
