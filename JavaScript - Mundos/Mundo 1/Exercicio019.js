/*
 * EXERCÍCIO 019: Sorteando um Item na Lista
 * Um professor quer sortear um dos seus quatros alunos para apagar o quadro.
 * Faça um programa que ajude ele, lendo o nome deles e escrevendo o nome do escolhido.
 */

random = Math.random()
random = Math.floor(random * 4)

var aluno1 = prompt("Primeiro aluno: ")
var aluno2 = prompt("Segundo aluno: ")
var aluno3 = prompt("Terceiro aluno: ")
var aluno4 = prompt("Quarto aluno: ")
var alunos = [aluno1, aluno2, aluno3, aluno4]
var escolhido = alunos[random]
document.write(`O aluno escolhido para apagar o quadro foi o: ${escolhido}`)
