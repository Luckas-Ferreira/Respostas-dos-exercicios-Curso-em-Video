/*
 * EXERCÍCIO 015: Aluguel de Carros
 * Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado
 * e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar,
 * sabendo que o carro custa R$ 60 por dia e R$ 0,15 por km rodado.
 */

var km = parseFloat(prompt('KM percorridos pelo carro: '))
var dias = parseInt(prompt('Quantidade de dias: '))
var valor_a_Pagar = (km * 0.15) + (dias * 60)
document.write(`Custo por KM rodado: R$${km * 0.15} <br>`)
document.write(`Custo por dias alugados: R$${dias * 60} <br>`)
document.write(`O preço a pagar é de: R$${valor_a_Pagar} <br>`)
