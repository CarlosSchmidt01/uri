# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
if 0 < n < 46:
    a = 0
    b = 1
    for i in range(n):
        if i != n - 1:
            bTemp = b
            b += a
            print(a, end=' ')
            a = bTemp
        elif i == n - 1:
            print(a)
