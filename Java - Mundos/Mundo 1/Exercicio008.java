
/*
 * EXERCÍCIO 008: Conversor de Medidas
 * Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
 */
import java.util.Scanner;
public class Exercicio008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float metro, centímetros, milímetros;
        System.out.print("Digite um valor em metros: ");
        metro = teclado.nextFloat();
        teclado.close();

        centímetros = metro * 100;
        milímetros = metro * 1000;
        System.out.printf("O valor em centímetros fica: %.2fcm \n", centímetros);
        System.out.printf("O valor em milímetros fica: %.2fmm \n", milímetros);
    }
}
