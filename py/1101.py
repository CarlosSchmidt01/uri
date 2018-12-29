# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
m = 1
n = 1
while m > 0 and n > 0:
    chairOfStr = input()
    [m, n] = [int(n) for n in chairOfStr.split(' ')]
    if m > 0 and n > 0:
        soma = 0
        if m > n:
            while m >= n:
                soma += n
                print("%d " % n, end='')
                n += 1
        elif m < n:
            while m <= n:
                soma += m
                print("%d " % m, end='')
                m += 1
        print("Sum=%d" % soma)
    else:
        break
