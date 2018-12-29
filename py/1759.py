# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
from math import pow
n = int(input())
if 1<=n<=pow(10,6):
    for i in range(n):
        if i < n-1:
            print('Ho', end=' ')
        if i == n-1:
            print('Ho!')
