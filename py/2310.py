# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
n = int(input())
if 1 <= n <= 100:
    saque = 0
    bloq = 0
    ataq = 0
    sTemp = 0
    bTemp = 0
    aTemp = 0
    sCert = 0
    bCert = 0
    aCert = 0
    for z in range(n):
        input()
        a = input()
        [S, B, A] = [int(i) for i in a.split()]
        b = input()
        [S1, B1, A1] = [int(x) for x in b.split()]
        if 0 <= S <= 10000 and 0 <= B <= 10000 and 0 <= A <= 10000:
            sTemp += S
            bTemp += B
            aTemp += A
        if 0 <= S1 <= S and 0 <= B1 <= B and 0 <= A1 <= A:
            sCert += S1
            bCert += B1
            aCert += A1
    saque = (sCert * 100) / sTemp
    bloq = (bCert * 100) / bTemp
    ataq = (aCert * 100) / aTemp
    print('Pontos de Saque: {:.2f} %.'.format(saque))
    print('Pontos de Bloqueio: {:.2f} %.'.format(bloq))
    print('Pontos de Ataque: {:.2f} %.'.format(ataq))
