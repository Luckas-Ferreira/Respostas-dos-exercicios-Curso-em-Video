/*
 * EXERCÍCIO 017: Catetos e Hipotenusa
 * Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente
 * de um triângulo retângulo, calcule e mostre o comprimento da hipotenusa.
 * 
 * co = float(input('Comprimento do cateto oposto: '))
 * ca = float(input('Comprimento do cateto adjacente: '))
 * hi = (co ** 2 + ca ** 2) ** (1 / 2)
 * print('A hipotenusa vai medir {:.2f}!'.format(hi))
 */

var co = Number(prompt('Cateto oposto: '))
var ca = Number(prompt('Cateto adjacente: '))
var hi = (co ** 2 + ca ** 2) ** (1 / 2)
document.write(`A hipotenusa vai medir ${hi.toFixed(2)}!`)
