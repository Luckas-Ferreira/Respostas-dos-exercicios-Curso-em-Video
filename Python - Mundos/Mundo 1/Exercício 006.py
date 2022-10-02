import math
"""
EXERCÍCIO 006: Dobro, Triplo, Raiz Quadrada
Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
"""

nu = int(input("Digite um número: "))
do = nu * 2
tr = nu * 3
rq = math.sqrt(nu)
print(f"O dobro é {do}, o triplo é {tr} e a raiz quadrada é {rq}")