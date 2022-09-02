/*
 * EXERCÍCIO 003: Somando Dois Números
 * Crie um programa que leia dois números e mostre a soma entre eles.
 */
import java.util.Scanner;
 public class Exercicio003 {
    public static void main(String[] args) {
        int n1, n2, s;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Segundo número: ");
        n2 = teclado.nextInt();
        teclado.close();

        s = n1 + n2;
        System.out.printf("A soma entre %d e %d é igual a %d ", n1, n2, s);
    }
}
