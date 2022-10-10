/*
 * EXERCÍCIO 018: Seno, Cosseno e Tangente
 * Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo. 
 */

var angulo = Number(prompt('Digite um ângulo: '))
var seno = Math.sin(angulo)
var cosseno = Math.cos(angulo)
var tangente = Math.tan(angulo)
document.write(`O ângulo ${angulo} tem as seguintes informaçẽos: <br> Seno: ${seno.toFixed(2)} <br> Cosseno: ${cosseno.toFixed(2)} <br> Tangente: ${tangente.toFixed(2)}`)
