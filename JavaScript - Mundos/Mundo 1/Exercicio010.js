/*
 *EXERCÍCIO 010: Conversor de Moedas
 * Crie um programa que leia quanto dinheiro uma pessoa tem na carteira
 * e mostre quantos Dólares ela pode comprar.
 * Considere U$ 1,00 = R$ 5,20
 */

var din = parseFloat(prompt('Quanto de dinheiro você tem? R$'))
var dolar = (din / 5,20)
document.write(`Com R$${din.toFixed(2)} dá para comprar $${dolar.toFixed(2)} dolares`)
