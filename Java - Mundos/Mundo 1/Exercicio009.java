
/*
 * EXERCÍCIO 009: Tabuada
 * Faça um programa que leia um número inteiro qualquer e mostre na tela a sua tabuada.
 */
import java.util.Scanner;
public class Exercicio009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int num = teclado.nextInt();
        teclado.close();

        System.out.printf("%d X 1 = %d \n", num, num * 1);  
        System.out.printf("%d X 2 = %d \n", num, num * 2);
        System.out.printf("%d X 3 = %d \n", num, num * 3);
        System.out.printf("%d X 4 = %d \n", num, num * 4);
        System.out.printf("%d X 5 = %d \n", num, num * 5);
        System.out.printf("%d X 6 = %d \n", num, num * 6);
        System.out.printf("%d X 7 = %d \n", num, num * 7);
        System.out.printf("%d X 8 = %d \n", num, num * 8);
        System.out.printf("%d X 9 = %d \n", num, num * 9);
        System.out.printf("%d X 10 = %d \n", num, num * 10);
              
    }
}
