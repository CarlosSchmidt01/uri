# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
x = 1
while x > 0:
    x = int(input())
    if x > 0:
        n = 1
        while n < x:
            print("%d" % n, end=' ')
            n += 1
        print("%d" % x)
