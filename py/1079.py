# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
def media(a, b, c):
    media = (a * 2 + b * 3 + c * 5) / 10
    print("%.1f"%(media))


n = int(input())
i = 0
while i < n:
    chairOfStr = input()
    [a,b,c]= [float(n) for n in chairOfStr.split(' ')]
    media(a, b, c)
    i += 1
