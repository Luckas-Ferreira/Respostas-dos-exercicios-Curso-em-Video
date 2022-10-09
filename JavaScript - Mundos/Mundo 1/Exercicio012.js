/*
 * EXERCÍCIO 012: Calculando Descontos
 * Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
 */

var preço = parseFloat(prompt('Valor do produto: '))
var desconto = preço - (preço * 0.05)
document.write(`Preço original: R$${preço.toFixed(2)} <br>Com 5% de desconto: R$${desconto.toFixed(2)}`)
