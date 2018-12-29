# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
x = int(input())
y = int(input())
a = 0
if x < y:
    x += 1
    while x < y:
        if x % 2 == 0:
            a = a
        else:
            a += x
        x += 1
elif x > y:
    x -= 1
    while x > y:
        if x % 2 == 0:
            a = a
        else:
            a += x
        x -= 1

print(a)
