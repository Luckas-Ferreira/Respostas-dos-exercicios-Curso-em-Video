import java.util.Scanner;

/*
 * EXERCÍCIO 012: Calculando Descontos
 * Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
 */

public class Exercicio012 {
    public static void main(String[] args) {
        double preço, desconto;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Preço do produto: R$");
        preço = teclado.nextFloat();
        desconto = preço - (preço * 0.05);
        teclado.close();
        System.out.print("O produto: R$" + preço +" com 5% de desconto fica: R$" + desconto);
    }
    
}
