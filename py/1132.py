# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
x = int(input())
y = int(input())
a = 0
if x <= y:
    while x <= y:
        if x % 13 != 0:
            a += x
        else:
            a = a
        x += 1
elif x >= y:
    while x >= y:
        if x % 13 != 0:
            a += x
        else:
            a = a
        x -= 1

print(a)
