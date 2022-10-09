/*
 * EXERCÍCIO 005: Antecessor e Sucessor
 * Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor.
 */

var num = Number.parseInt(prompt('Digite um número: '))
var antecessor = num - 1
var sucessor   = num + 1
document.write(`O número ${num} tem como antecessor o ${antecessor} e seu sucessor é o ${sucessor}`)