# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
chair_of_str=input()
[h1, m1, h2, m2]=[int(n) for n in chair_of_str.split(' ')]
horaTot = h2 - h1
if horaTot < 0:
    horaTot += 24

minTotal = m2 - m1
if minTotal < 0:
    minTotal += 60
    horaTot -= 1

if h1 == h2 and m1 == m2:
    print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
else:
    print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" % (horaTot, minTotal))
