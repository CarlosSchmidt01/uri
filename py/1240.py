# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
from math import pow

n = int(input())
for i in range(n):
    z = input()
    [a, b] = [x for x in z.split()]
    if 1 <= int(a) <= pow(2, 31) and 1 <= int(b) <= pow(2, 31):
        c = a[(len(b) * -1):]
        if b in c:
            print('encaixa')
        else:
            print('nao encaixa')
