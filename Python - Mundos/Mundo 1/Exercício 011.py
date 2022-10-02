'''
EXERCÍCIO 011: Pintando Parede
Faça um programa que leia a largura e a altura de uma parede em metros,
calcule a sua área e a quantidade de tinta necessária para pintá-la,
sabendo que cada litro de tinta, pinta uma área de 2 m².
'''

lar = float(input("Largura: "))
alt = float(input("Altura:  "))
area = lar * alt
tinta = area / 2
print(f"{lar} X {alt} \nArea {area}\nVai precisar de {tinta :.2f} lata de tinta para pintar essa parede")