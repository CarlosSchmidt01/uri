# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
y = 0
if 1 <= n <= 4:
    v = input()
    lista = [a,b,c,d,e] = [int(z) for z in v.split(' ')]
    for i in range(len(lista)):
        if lista[i] == n:
            y += 1
    print(y)
