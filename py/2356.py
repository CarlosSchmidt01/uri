# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
while True:
    try:
        d=input()
        s=input()
        if 1<=len(d)<=100 and 1<=len(s)<=100:
            if 'A' in d.upper() or 'C' in d.upper() or 'G' in d.upper() or 'T' in d.upper() and 'A' in s.upper() or 'C' in s.upper() or 'G' in s.upper() or 'T' in s.upper():
                if s in d:
                    print('Resistente')
                else:
                    print('Nao resistente')
            else:
                break
        else:
            break
    except:
        break
