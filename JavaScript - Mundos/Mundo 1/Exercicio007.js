/*
 * EXERCÍCIO 007: Média Aritmética
 * Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
 */

var n1 = Number.parseFloat(prompt('Primeira nota: '))
var n2 = Number.parseFloat(prompt('Segunda nota: '))
var media = (n1 + n2) / 2
document.write(`A media entre ${n1} e ${n2} é igual a ${media}`)