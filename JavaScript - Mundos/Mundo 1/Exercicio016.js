/*
 * EXERCÍCIO 016: Quebrando um Número
 * Crie um programa que leia um número real qualquer pelo teclado e mostre na tela a sua porção inteira.
 * 
 * Ex:
 * Digite um número: 6.127
 * O número 6.127 tem a parte inteira 6.
 * 
 * from math import trunc
 * num = float(input('Digite um valor: '))
 * print('O valor digitado foi {} e a sua porção inteira é {}!'.format(num, trunc(num)))
 */

var num = parseFloat(prompt('Digite um número: '))
document.write(`O número ${num} tem a parte inteira ${Math.trunc(num)}`)

