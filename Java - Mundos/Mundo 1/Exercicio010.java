/*
 *EXERCÍCIO 010: Conversor de Moedas
 * Crie um programa que leia quanto dinheiro uma pessoa tem na carteira
 * e mostre quantos Dólares ela pode comprar.
 * Considere U$ 1,00 = R$ 3,27
 */
import java.util.Scanner;
public class Exercicio010 {
    public static void main(String[] args) {
        int dinheiro;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quando de dinheiro você tem na carteira? ");
        dinheiro = teclado.nextInt();
        teclado.close();
        
        float dolar = (float) (dinheiro / 3.27);
        System.out.printf("R$%d convertido para dolar fica $%.2f", dinheiro, dolar);
    }
}
