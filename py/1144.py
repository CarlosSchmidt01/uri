# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
a = int(input())
b = 1
while b <= a:
    c = b * b
    d = b * b * b
    print("%d %d %d" % (b, c, d))
    e = c + 1
    f = d + 1
    print("%d %d %d" % (b, e, f))

    b += 1
