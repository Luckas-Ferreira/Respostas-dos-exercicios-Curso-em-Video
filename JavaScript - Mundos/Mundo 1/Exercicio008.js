/*
 * EXERCÍCIO 008: Conversor de Medidas
 * Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
 */

var metro = parseFloat(prompt('Digite um valor em metros: '))
var centímetros = metro * 100
var milímetros  = metro * 1000
document.write(`O valor ${metro} em centímetros fica: ${centímetros.toFixed(2)}cm, e em milímetros fica: ${milímetros.toFixed(2)}mm`)
