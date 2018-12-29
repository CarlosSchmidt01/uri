# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
while True:
    try:
        a = input()
        l = [int(n) for n in a.split()]
        b = l[0] ^l[1]
        print(b)
    except:
        break
