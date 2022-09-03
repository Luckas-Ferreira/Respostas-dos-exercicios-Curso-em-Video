/*
 * EXERCÍCIO 004: Dissecando uma Variável
 * Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo
 * e todas as informações possíveis sobre ele.
 */
import java.util.Scanner;
 public class Exercicio004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String n = teclado.nextLine();
        teclado.close();
        System.out.println("Está em branco: " + n.isBlank());
        System.out.println("Tamanho: " + n.length());
        System.out.println("Todo em Maiusculo: " + n.toUpperCase());
        System.out.println("Todo em Minusculo: " + n.toLowerCase());
    }
}
