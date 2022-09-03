/*
 * EXERCÍCIO 006: Dobro, Triplo, Raiz Quadrada
 * Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
 */

import java.util.Scanner;
 public class Exercicio006 {
    public static void main(String[] args) {
        int num, dobro, triplo;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        teclado.close();

        double raizQuadrada = (double) Math.sqrt(num);
        dobro = num * 2;
        triplo = num * 3;
        
        System.out.println("você digitou o número " + num);
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);
        System.out.printf("Raiz Quadrada: %.2f", raizQuadrada);
    }
}
