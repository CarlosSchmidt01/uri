# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
while True:
    try:
        a = input()
        [v, t] = [int(n) for n in a.split()]
        if -100 <= v <= 100 and 0 <= t <= 200:
            temp = t * 2
            result = temp * v
        else:
            break
        print(result)
    except:
        break
