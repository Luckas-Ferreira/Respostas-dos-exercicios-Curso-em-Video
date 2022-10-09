/*
 * EXERCÍCIO 011: Pintando Parede
 * Faça um programa que leia a largura e a altura de uma parede em metros,
 * calcule a sua área e a quantidade de tinta necessária para pintá-la,
 * sabendo que cada litro de tinta, pinta uma área de 2 m².
 */

var largura = parseFloat(prompt('Largura: '))
var altura = parseFloat(prompt('Altura: '))
var area   = (largura * altura)
var quant_Tinta = area / 2
document.write(`ÁREA: ${area} <br>Com essas dimensões será necessario cerca de ${quant_Tinta} litros de tinta para pintar essa parede.`)

