# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
def fatorial(n):
    i=n
    fat=1
    a=0
    while i>0:
        fat=fat*n
        i-=1
        n-=1
    print(fat)


n=int(input())
fatorial(n)
