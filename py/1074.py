# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
if n < 10000:
    a = 0
    while a < n:
        x = int(input())
        if -10000000 < x < 10000000:
            if x % 2 == 0 and x > 0:
                print("EVEN POSITIVE")
            elif x % 2 == 0 and x < 0:
                print("EVEN NEGATIVE")
            elif x % 2 == 1 and x > 0:
                print("ODD POSITIVE")
            elif x % 2 == 1 and x < 0:
                print("ODD NEGATIVE")
            elif x == 0:
                print("NULL")
        a += 1
