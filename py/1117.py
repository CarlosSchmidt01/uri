# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
nota = 0
v = 0
while v < 2:
    n = float(input())
    if 0 <= n <= 10:
        nota += n
        v += 1
    else:
        print("nota invalida")
media = nota / 2
print("media = %.2f" % media)
