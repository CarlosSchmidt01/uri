# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
x = 1
while x != 0:
    soma = 0
    x = int(input())
    if x != 0:
        a = 0
        while a < 5:
            if x % 2 == 0:
                soma += x
                x += 1
                a += 1
            else:
                x += 1
        print(soma)
