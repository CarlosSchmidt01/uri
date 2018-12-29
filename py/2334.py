# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
from math import pow

p = int(input())
while p != -1:
    if 0 <= p <= pow(10, 19):
        v = 0
        if p == 0:
            v = 0
        elif p > 0:
            v = p - 1
        print(v)
        p = int(input())
        if p == -1:
            break
