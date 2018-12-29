# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
if 1 <= n <= 1000:
    c = input()
    l = [int(i) for i in c.split()]
    if len(l) == n:
        m2 = 0
        m3 = 0
        m4 = 0
        m5 = 0
        for a in range(len(l)):
            if l[a] % 2 == 0:
                m2 += 1
            if l[a] % 3 == 0:
                m3 += 1
            if l[a] % 4 == 0:
                m4 += 1
            if l[a] % 5 == 0:
                m5 += 1
        print('{} Multiplo(s) de 2'.format(m2))
        print('{} Multiplo(s) de 3'.format(m3))
        print('{} Multiplo(s) de 4'.format(m4))
        print('{} Multiplo(s) de 5'.format(m5))
