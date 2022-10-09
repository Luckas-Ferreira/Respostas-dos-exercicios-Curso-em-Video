/*
 * EXERCÍCIO 011: Pintando Parede
 * Faça um programa que leia a largura e a altura de uma parede em metros,
 * calcule a sua área e a quantidade de tinta necessária para pintá-la,
 * sabendo que cada litro de tinta, pinta uma área de 2 m².
 */
import java.util.Scanner;
public class Exercicio011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double largura, altura, area, quantidadeTinta;
        
        System.out.print("Largura: ");
        largura = teclado.nextDouble();
        System.out.print("Altura: ");
        altura  = teclado.nextDouble();
        teclado.close();

        area = largura * altura;
        quantidadeTinta = area / 2;
        System.out.printf("ÁREA: %.2f \nSerá necessário %.2f latas de tinta.",area, quantidadeTinta);
    }
}
