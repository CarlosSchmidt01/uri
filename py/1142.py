# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
i = 1
final = n * 4
while i <= final:
    if i % 4 == 0:
        print("PUM")
    else:
        print(i, end=' ')
    i += 1
