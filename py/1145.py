# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
chairOfStr = input()
[x,y]= [int(n) for n in chairOfStr.split(' ')]
if 1 < x < 20 and x < y < 100000:
    n = 1
    while n <= y:
        if n % x != 0:
            print(n, end=' ')
        elif n % x == 0:
            print(n)
        n += 1
