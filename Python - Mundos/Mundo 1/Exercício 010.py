"""
EXERCÍCIO 010: Conversor de Moedas
Crie um programa que leia quanto dinheiro uma pessoa tem na carteira
e mostre quantos Dólares ela pode comprar.
Considere U$ 1,00 = R$ 3,27
"""

d = float(input("Digite um valor em reais: "))
c = d / 3.27
print(f"Com R${d} dá pra comprar cerca de ${c}")
