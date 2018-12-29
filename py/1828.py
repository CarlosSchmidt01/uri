# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
t = int(input())
if t <= 100:
    for i in range(t):
        a = input()
        [S, R] = [x for x in a.split()]
        s = S.lower()
        r = R.lower()
        if s == 'tesoura' and r == 'papel' or s == 'papel' and r == 'pedra' or s == 'pedra' and r == 'lagarto' or s == 'lagarto' and r == 'spock' or s == 'spock' and r == 'tesoura' or s == 'tesoura' and r == 'lagarto' or s == 'lagarto' and r == 'papel' or s == 'papel' and r == 'spock' or s == 'spock' and r == 'pedra' or s == 'pedra' and r == 'tesoura':
            result = 'Bazinga!'
            print('Caso #{}: {}'.format((i + 1), result))
        elif r == 'tesoura' and s == 'papel' or r == 'papel' and s == 'pedra' or r == 'pedra' and s == 'lagarto' or r == 'lagarto' and s == 'spock' or r == 'spock' and s == 'tesoura' or r == 'tesoura' and s == 'lagarto' or r == 'lagarto' and s == 'papel' or r == 'papel' and s == 'spock' or r == 'spock' and s == 'pedra' or r == 'pedra' and s == 'tesoura':
            result = 'Raj trapaceou!'
            print('Caso #{}: {}'.format((i + 1), result))
        elif s == r:
            result = 'De novo!'
            print('Caso #{}: {}'.format((i + 1), result))
