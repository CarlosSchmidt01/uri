# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
if 1 <= n <= 10000:
    a = input()
    l = [i for i in a.split()]
    if len(l) == n:
        for b in range(len(l)):
            if len(l[b]) == 3 and l[b][:2].upper() == 'OB':
                l[b] = 'OBI'
            elif len(l[b]) == 3 and l[b][:2].upper() == 'UR':
                l[b] = 'URI'
            else:
                l[b] = l[b].upper()
            if b+1 < len(l):
                print(l[b], end=' ')
            else:
                print(l[b])
