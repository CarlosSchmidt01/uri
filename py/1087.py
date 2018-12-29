# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
def abso(a):
    b = 0
    if a < 0:
        b = a * -1
    else:
        b = a
    return b


a = input()

while a != '0 0 0 0':
    l = [int(n) for n in a.split()]
    if l[0] == l[2] and l[1] == l[3]:
        print('0')
    elif l[0] == l[2] or l[1] == l[3]:
        print('1')
    else:
        r = l[0] - l[2]
        res = abso(r)
        r2 = l[1]-l[3]
        res2 = abso(r2)
        if res - res2 == 0:
            print('1')
        else:
            print('2')

    a = input()
