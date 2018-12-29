# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
from math import pow

k = int(input())
while k != 0:
    if 0 < k <= pow(10, 3):
        a = input()
        [n, m] = [int(c) for c in a.split()]
        for i in range(k):
            b = input()
            [x, y] = [int(d) for d in b.split()]
            if -pow(10, 4) < n < pow(10, 4) and -pow(10, 4) < m < pow(10, 4):
                if -pow(10, 4) <= x <= pow(10, 4) and -pow(10, 4) <= y <= pow(10, 4):
                    if n < x and m < y:
                        print('NE')
                    elif n < x and m > y:
                        print('SE')
                    elif n > x and m < y:
                        print('NO')
                    elif n > x and m > y:
                        print('SO')
                    else:
                        print('divisa')
    k = int(input())
