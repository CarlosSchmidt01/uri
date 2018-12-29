# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
i = 0
while i < n:
    chairOfStr = input()
    [x, y] = [int(a) for a in chairOfStr.split(' ')]
    z = 0
    soma = 0
    while z < y:
        if x % 2 == 1:
            soma += x
            x += 1
            z += 1
        else:
            x += 1
    i += 1
    print(soma)
