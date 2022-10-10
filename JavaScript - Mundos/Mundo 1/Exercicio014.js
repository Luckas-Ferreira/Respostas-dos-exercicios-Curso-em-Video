/* EXERCÍCIO 014: Conversor de Temperaturas
 * Escreva um programa que converta uma temperatura digitada em ºC e converta para ºF.
 */

var temp = parseFloat(prompt('Digite uma temperatura em ºC: '))
var conversão = (temp * (9 / 5)) + 32
document.write(`ºC ${temp.toFixed(2)} graus Celsius para Fahrenheit fica ºF ${conversão.toFixed(2)}`)
