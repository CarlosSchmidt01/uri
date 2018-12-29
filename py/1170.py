# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())

if 1 <= n <= 1000:
    for i in range(n):
        d = 0
        c = float(input())
        if 1 <= c <= 1000:
            while c > 1:
                c /= 2
                d += 1
        print('{} dias'.format(d))
