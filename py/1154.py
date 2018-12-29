# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
idade = 0
soma = 0
quantidade = 0
while idade >= 0:
    idade = int(input())
    if idade >= 0:
        soma += idade
        quantidade += 1
media = soma / quantidade
print("%.2f" % media)
