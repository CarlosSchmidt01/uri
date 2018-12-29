# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''
a = input()
while a.strip(' ') != '0 0 0 0':
        min = 0
        l = [int(n) for n in a.split()]
        if 0 <= l[0] <= 23 and 0 <= l[1] <= 59 and 0 <= l[2] <= 23 and 0 <= l[3] <= 59:
            if l[0] < l[2]:
                min += (l[2] - l[0]) * 60
                if l[1] < l[3]:
                    min += (l[3] - l[1])
                elif l[1] > l[3]:
                    min -= l[1] - l[3]
            if l[0] > l[2]:
                min = 1440
                min -= (l[0] - l[2]) * 60
                if l[1] < l[3]:
                    min += (l[3] - l[1])
                elif l[1] > l[3]:
                    min -= l[1] - l[3]
            if l[0] == l[2]:
                if l[1] < l[3]:
                    min += (l[3] - l[1])
                elif l[1] > l[3]:
                    min = 1440
                    min -= l[1] - l[3]
                elif l[1] == l[3]:
                    min = 1440
            print(min)
            a = input()
            if a.strip() == '0 0 0 0':
                break
