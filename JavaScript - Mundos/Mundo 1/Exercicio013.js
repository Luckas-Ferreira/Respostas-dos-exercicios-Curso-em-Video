/*
 * EXERCÍCIO 013: Reajuste Salarial
 * Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
 */

var salário = parseFloat(prompt('Salário: R$'))
var aumento = salário + (salário * 0.15)
document.write(`Salário atual: R$${salário.toFixed(2)} <br>Salário com 15% de aumento fica: R$${aumento.toFixed(2)}`)
