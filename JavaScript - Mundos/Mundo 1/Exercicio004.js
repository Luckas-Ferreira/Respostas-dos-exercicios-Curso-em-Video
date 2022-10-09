/*
 * EXERCÍCIO 004: Dissecando uma Variável
 * Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo
 * e todas as informações possíveis sobre ele.
 */

var frase = prompt('Digite algo: ')
document.write(`É do tipo: ${typeof(frase)} <br>`)
document.write(`É um uma frase: ${isNaN(frase)} <br>`)
document.write(`Tem ${frase.length} letras <br>`)
document.write(`Em maiusculo: ${frase.toUpperCase()} <br>`)
document.write(`Em minusculo: ${frase.toLowerCase()} <br>`)